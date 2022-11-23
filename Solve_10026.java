import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_10026 {

    static char[][] map;
    static char[][] map2;
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count = 0;
    static int redGreenCount = 0;

    static class Location {
        int y;
        int x;
        char data;

        Location(int y, int x, char data) {
            this.y = y;
            this.x = x;
            this.data = data;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        map2 = new char[N][N];

        for (int i=0; i<N; i++) {
            String input = br.readLine();
            for (int j=0; j<N; j++) {
                char now = input.charAt(j);
                map[i][j] = now;
                if (now == 'G')
                    map2[i][j] = 'R';
                else
                    map2[i][j] = now;
            }
        }
        StringBuilder sb = new StringBuilder();
        bfs(map, new boolean[N][N], 0);
        bfs(map2, new boolean[N][N], 1);
        sb.append(count + " " + redGreenCount);
        System.out.print(sb);
    }

    public static void bfs(char[][] map, boolean[][] visited, int type) {
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (!visited[i][j]) {
                    Queue<Location> queue = new LinkedList<>();
                    visited[i][j] = true;
                    queue.add(new Location(i, j, map[i][j]));
                    while (!queue.isEmpty()) {
                        Location location = queue.poll();
                        for (int k=0; k<4; k++) {
                            int nY = location.y + dy[k];
                            int nX = location.x + dx[k];

                            if (nY < 0 || nX >= N || nX < 0 || nY >= N)
                                continue;

                            if (!visited[nY][nX] && map[nY][nX] == location.data) {
                                visited[nY][nX] = true;
                                queue.add(new Location(nY, nX, map[nY][nX]));
                            }
                        }
                    }

                    if (type == 0)
                        count++;
                    else
                        redGreenCount++;
                }
            }
        }
    }
}
