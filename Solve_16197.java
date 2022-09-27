import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_16197 {

    static int minCount = Integer.MAX_VALUE;
    static int N, M;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        boolean isFirst = true;
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = input.charAt(j);
                if (map[i][j] == 'o') {
                    if (isFirst) {
                        x1 = j;
                        y1 = i;
                        isFirst = !isFirst;
                    }
                    else {
                        x2 = j;
                        y2 = i;
                    }

                }
            }
        }

        dfs(x1, y1, x2, y2, 0);

        if (minCount == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(minCount + 1);

    }

    public static void dfs(int x1, int y1, int x2, int y2, int nowCount) {

        if (nowCount >= minCount || nowCount >= 10)
            return;

        for (int i=0; i<4; i++) {
            int outSideCount = 0;
            int nX1 = x1 + dx[i];
            int nY1 = y1 + dy[i];
            int nX2 = x2 + dx[i];
            int nY2 = y2 + dy[i];

            if (nX1<0 || nX1>=M || nY1<0 || nY1>=N)
                outSideCount++;

            if (nX2<0 || nX2>=M || nY2<0 || nY2>=N)
                outSideCount++;

            if (outSideCount == 2)
                continue;

            if (outSideCount == 1) {
                minCount = Math.min(minCount, nowCount);
                return;
            }

            if (map[nY1][nX1] == '#') {
                nX1 = x1;
                nY1 = y1;
            }

            if (map[nY2][nX2] == '#') {
                nX2 = x1;
                nY2 = y1;
            }

            dfs(nX1, nY1, nX2, nY2, nowCount + 1);
        }
    }
}