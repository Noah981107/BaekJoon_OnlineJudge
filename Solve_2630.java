import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2630 {

    static int N, whiteCount = 0, blueCount = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 0, N);

        System.out.println(whiteCount);
        System.out.print(blueCount);
    }

    public static void solution(int x, int y, int n) {
        int nowColor = map[x][y];
        for (int i=x; i<x + n; i++) {
            for (int j=y; j<y+n; j++) {
                if (nowColor != map[i][j]) {

                    int half = n / 2;

                    solution(x, y, half);
                    solution(x, y + half, half);
                    solution(x + half, y, half);
                    solution(x + half, y + half, half);
                    return;
                }
            }
        }

        if (nowColor == 0)
            whiteCount++;
        else
            blueCount++;
    }
}
