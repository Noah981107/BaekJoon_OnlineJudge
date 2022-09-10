import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_2178 {

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

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int[][] distance = new int[n][m];
        Queue<Location> queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            String txt = br.readLine();
            for (int j=0; j<m; j++) {
                map[i][j] = txt.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        queue.add(new Location(0, 0));
        distance[0][0] = 1;

        while(!queue.isEmpty()) {

            Location location = queue.poll();

            for(int i=0; i<dx.length; i++) {

                int nX = location.x + dx[i];
                int nY = location.y + dy[i];

                if (nX<0 || nX>=n || nY<0 || nY>=m)
                    continue;

                if (!visited[nX][nY] && map[nX][nY] == 1) {
                    visited[nX][nY] = true;
                    queue.add(new Location(nX, nY));
                    distance[nX][nY] = distance[location.x][location.y] + 1;
                }
            }
        }
        System.out.println(distance[n-1][m-1]);
    }
}