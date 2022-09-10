import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_2468 {

    private static int N;
    private static int[][] map;
    private static int minHeight = 101;
    private static int maxHeight = 1;
    private static int maxSafeAreaNum = 1;
    private static int[] dx = {-1, 1, 0 , 0};
    private static int[] dy = {0, 0, -1, 1};

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
        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, map[i][j]);
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        solution();
    }

    public static void solution() {

        for(int height=minHeight; height<=maxHeight; height++) {

            boolean[][] visited = new boolean[N][N];
            Queue<Location> queue = new LinkedList<>();
            int numSafeArea = 0;

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {

                    if (map[i][j] <= height || visited[i][j])
                        continue;

                    visited[i][j] = true;
                    queue.add(new Location(i, j));
                    while(!queue.isEmpty()) {
                        Location location = queue.poll();
                        for(int k=0; k<dx.length; k++) {
                            int nX = location.x + dx[k];
                            int nY = location.y + dy[k];

                            if (nX<0 || nX>=N || nY<0 || nY>=N)
                                continue;

                            if (map[nX][nY] > height && !visited[nX][nY]) {
                                visited[nX][nY] = true;
                                queue.add(new Location(nX, nY));
                            }
                        }
                    }
                    numSafeArea++;
                }
            }
            maxSafeAreaNum = Math.max(maxSafeAreaNum, numSafeArea);
        }

        System.out.println(maxSafeAreaNum);
    }
}
