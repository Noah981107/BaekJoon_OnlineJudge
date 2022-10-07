import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_16395 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n][n];
        dp[0][0] = 1;

        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }

        System.out.println(dp[n-1][k-1]);
    }
}
