import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_11051 {

    private static int N;
    private static int K;
    private static int[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];

        solution(N, K);

        for (int[] ele : map) {
            System.out.println(Arrays.toString(ele));
        }

        System.out.println(map[N][K]);
    }

    public static void solution(int n, int k) {

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j <= i; j++) {
                if(i == j || j == 0) map[i][j] = 1;
                else map[i][j] = (map[i-1][j-1] + map[i-1][j]) % 10007;
            }
        }
    }
}
