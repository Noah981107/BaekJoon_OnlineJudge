import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_25501 {

    static int T;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        while(T --> 0) {
            count = 0;
            String input = br.readLine();
            int result = solution(0, input.length() - 1, input);
            sb.append(result + " ").append(count).append("\n");
        }

        System.out.println(sb);
    }

    public static int solution(int start, int end, String txt) {

        count++;

        if (start >= end)
            return 1;
        else if (txt.charAt(start) != txt.charAt(end))
            return 0;
        else
            return solution(start + 1, end - 1, txt);
    }
}
