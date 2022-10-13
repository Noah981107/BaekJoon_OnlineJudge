import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        long[] dp = new long[100];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        for (int j=3; j<100; j++) {
            dp[j] = dp[j - 2] + dp[j - 3];
        }
        
        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n - 1]);
        }
    }
}
