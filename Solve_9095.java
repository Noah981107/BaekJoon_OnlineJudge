import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Integer[] dp = new Integer[11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int j=4; j<=10; j++){
            dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
        }

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
