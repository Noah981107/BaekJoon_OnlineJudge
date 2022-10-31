import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_9184 {

    // a b c
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a==-1 && b==-1 && c==-1)
                break;

            sb.append("w(" + a + ", " + b + ", " + c + ")" + " = ").append(solution(a, b, c)).append("\n");
        }

        System.out.print(sb);
    }

    public static int solution(int a, int b, int c) {
        if (a <=0 || b<=0 || c<=0)
            return 1;

        if (a>20 || b>20 || c>20)
            return solution(20, 20, 20);

        if (dp[a][b][c] != 0)
            return dp[a][b][c];

        if (a<b && b<c) {
            dp[a][b][c] = solution(a, b, c-1) + solution(a, b-1, c-1) - solution(a, b-1, c);
            return dp[a][b][c];
        }

        dp[a][b][c] = solution(a-1, b, c) + solution(a-1, b-1, c) + solution(a-1, b, c-1) - solution(a-1, b-1, c-1);
        return dp[a][b][c];
    }
}
