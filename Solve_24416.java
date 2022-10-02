import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_24416 {

    static int n;
    static int recursiveCount = 0;
    static int dpCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        recur(n);
        dpFunction(n);

        StringBuilder sb = new StringBuilder();
        sb.append(recursiveCount + " ").append(dpCount);
        System.out.println(sb);
    }

    public static int dpFunction(int x) {
        int[] answer = new int[x + 1];
        answer[1] = 1;
        answer[2] = 1;
        for (int i=3; i<answer.length; i++) {
            dpCount++;
            answer[i] = answer[i-1] + answer[i-3];
        }
        return answer[x];
    }

    public static int recur(int x) {

        if (x <= 2) {
            recursiveCount++;
            return 1;
        }
        else
            return recur(x - 1) + recur(x - 2);
    }
}
