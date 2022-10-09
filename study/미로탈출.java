import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question3 {

    static int N, M;
    static int[][] map, distance;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Location> queue = new LinkedList<>();

    static class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        distance = new int[N][M];
        visited = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String input = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        
        bfs();

        System.out.println(distance[N-1][M-1]);
    }

    public static void bfs() {
        queue.add(new Location(0, 0));
        visited[0][0] = true;
        distance[0][0] = 1;
        while(!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i=0; i<4; i++) {
                int nX = location.x + dx[i];
                int nY = location.y + dy[i];

                if (nX<0 || nX>=N || nY<0 || nY>=M)
                    continue;

                if (map[nX][nY] == 1 && !visited[nX][nY]) {
                    visited[nX][nY] = true;
                    queue.add(new Location(nX, nY));
                    distance[nX][nY] = distance[location.x][location.y] + 1;
                }
            }
        }
    }
}
