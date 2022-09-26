import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_6603 {

    static String[] input;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            input = br.readLine().split(" ");

            if (input[0].equals("0"))
                break;

            arr = new int[6];
            StringBuilder sb = new StringBuilder();
            solution(1, 0, sb);
            System.out.println(sb);
        }
    }

    public static void solution(int start, int level, StringBuilder sb) {

        if (level == arr.length) {
            for (int ele : arr)
                sb.append(ele).append(" ");
            sb.append("\n");
            return;
        }

        for (int i=start; i<input.length; i++) {
            arr[level] = Integer.parseInt(input[i]);
            solution(i + 1, level + 1, sb);
        }

    }
}
