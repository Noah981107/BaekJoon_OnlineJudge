import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1932 {

    static int N;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i=0; i<N; i++) {
            dp[N-1][i] = arr[N-1][i];
        }
        System.out.println(solution(0, 0));
    }

    public static int solution(int level, int idx) {
        if (level == N-1)
            return dp[level][idx];

        if (dp[level][idx] == -1) {
            dp[level][idx] = Math.max(solution(level + 1, idx), solution(level + 1, idx + 1)) + arr[level][idx];
        }

        return dp[level][idx];
    }
}
