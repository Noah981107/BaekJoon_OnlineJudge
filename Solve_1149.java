import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1149 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];

        String[] input1 = br.readLine().split(" ");
        dp[0][0] = Integer.parseInt(input1[0]);
        dp[0][1] = Integer.parseInt(input1[1]);
        dp[0][2] = Integer.parseInt(input1[2]);

        for (int i=1; i<N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j=0; j<3; j++) {
                dp[i][j] = Integer.parseInt(input[j]) + Math.min(dp[i-1][(j + 1) % 3], dp[i-1][(j + 2) % 3]);
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int i=0; i<3; i++) {
            if (dp[N-1][i] < minCost)
                minCost = dp[N-1][i];
        }

        System.out.println(minCost);
    }
}
