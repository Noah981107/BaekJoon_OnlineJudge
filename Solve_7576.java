import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_7576 {

    static int M, N;
    static int[][] map;
    static int[][] visited;
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
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    queue.add(new Location(i, j));
                }
            }
        }
        System.out.println(solution());
    }

    public static int solution() {

        int result = -2;
        while (!queue.isEmpty()) {
            Location location = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nX = location.x + dx[k];
                int nY = location.y + dy[k];

                if (nX < 0 || nX >= N || nY < 0 || nY >= M)
                    continue;

                if (map[nX][nY] == 0) {
                    map[nX][nY] = map[location.x][location.y] + 1;
                    queue.add(new Location(nX, nY));
                }
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (map[i][j] == 0)
                    return -1;
                result = Math.max(result, map[i][j]);
            }
        }

        if (result == 1)
            return 0;
        else
            return result - 1;
    }
}