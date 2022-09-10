import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_1926 {

    private static int n;
    private static int m;
    private static int[][] map;
    private static int count = 0;
    private static boolean[][] visited;
    private static int maxArea = 0;
    // 왼쪽 오른쪽 위 아래 순으로!!!!!
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};
    private static Queue<Location> queue;

    public static class Location {
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

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
        System.out.println(count);
        System.out.println(maxArea);
    }

    private static void solution() {

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (map[i][j] == 0 || visited[i][j])
                    continue;

                int area = 0;
                count++;
                queue.add(new Location(i, j));
                visited[i][j] = true;

                while(!queue.isEmpty()) {
                    Location location = queue.poll();
                    area += 1;
                    for (int k=0; k<4; k++) {
                        int nX = location.x + dx[k];
                        int nY = location.y + dy[k];

                        if (nX < 0 || nX >=n || nY<0 || nY>=m)
                            continue;

                        if (map[nX][nY] == 1 && !visited[nX][nY]) {
                            queue.add(new Location(nX, nY));
                            visited[nX][nY] = true;
                        }
                    }
                }
                if (area > maxArea)
                    maxArea = area;
            }
        }
    }
}
