import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_7569 {

    static int M, N, H;
    static int[][][] map;
    static boolean[][][] visited;
    static int[][][] day;
    static int[] dx = {-1, 1, 0, 0, 0 ,0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    static class Tomato {
        int x;
        int y;
        int z;

        Tomato(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        visited = new boolean[H][N][M];
        day = new int[H][N][M];

        Queue<Tomato> queue = new LinkedList<>();
        for (int height=0; height<H; height++) {
            for (int row=0; row<N; row++) {
                st = new StringTokenizer(br.readLine());
                for (int column=0; column<M; column++) {
                    map[height][row][column] = Integer.parseInt(st.nextToken());
                    if (map[height][row][column] == 1) {
                        visited[height][row][column] = true;
                        day[height][row][column] = 1;
                        queue.add(new Tomato(column, row, height));
                    }
                }
            }
        }

        bfs(queue);

        int maxDay = 0;

        for (int z=0; z<H; z++) {
            for (int y=0; y<N; y++) {
                for (int x=0; x<M; x++) {
                    if (map[z][y][x] == 0 && !visited[z][y][x]) {
                        System.out.println(-1);
                        return;
                    }
                    maxDay = Math.max(maxDay, day[z][y][x]);
                }
            }
        }

        System.out.print(maxDay - 1);
    }

    public static void bfs(Queue<Tomato> queue) {
        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();

            for (int i=0; i<6; i++) {
                int nX = tomato.x + dx[i];
                int nY = tomato.y + dy[i];
                int nZ = tomato.z + dz[i];

                if (nX < 0 || nX >= M || nY < 0 || nY >= N || nZ < 0 || nZ >= H)
                    continue;

                if (!visited[nZ][nY][nX] && map[nZ][nY][nX] == 0) {
                    visited[nZ][nY][nX] = true;
                    day[nZ][nY][nX] = day[tomato.z][tomato.y][tomato.x] + 1;
                    queue.add(new Tomato(nX, nY, nZ));
                }
            }

        }
    }
}
