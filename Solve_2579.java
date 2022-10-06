import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_2579 {

    static int N;
    static int[] stairs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        stairs = new int[301];
        for (int i=1;i<=N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[301];
        dp[0] = 0;
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];
        dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];
        for (int i=4; i<=N; i++) {
            dp[i] = Math.max(dp[i-2], (dp[i-3] + stairs[i-1])) + stairs[i];
        }

        System.out.println(dp[N]);
    }
}
