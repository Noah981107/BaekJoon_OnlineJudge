import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question2 {

    static int N;
    static int M;
    static int count = 0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1 , 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String input = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (dfs(i, j))
                    count++;
            }
        }

        System.out.println(count);
    }

    public static boolean dfs(int x, int y) {

        if (x<0 || x>=N || y<0 || y>=M)
            return false;

        if (map[x][y] == 0 && !visited[x][y]) {
            visited[x][y] = true;
            for (int i=0; i<4; i++) {
                int nX = x + dx[i];
                int nY = y + dy[i];

                dfs(nX, nY);
            }
            return true;
        }

        return false;
    }
}
