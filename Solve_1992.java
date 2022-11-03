import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1992 {

    static int N;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i=0; i<N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j=0; j<N; j++) {
                map[i][j] = input[j] - '0';
            }
        }

        solution(0, 0, N);
        System.out.println(sb);
    }

    public static void solution(int x, int y, int n) {

        int now = map[x][y];

        for (int i=x; i<x + n; i++) {
            for (int j=y; j<y + n; j++) {
                if (now != map[i][j]) {
                    int half = n / 2;

                    sb.append("(");
                    // 왼위 오위 왼아 오아
                    solution(x, y, half);
                    solution(x, y + half, half);
                    solution(x + half, y, half);
                    solution(x + half, y+half, half);
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(now);
    }
}
