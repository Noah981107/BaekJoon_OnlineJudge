import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_14502 {

    public static int n, m;
    public static int[][] map;
    public static boolean[][] visited;
    public static int[] dx={-1,1,0,0}, dy={0,0,-1,1};
    public static int maxSafeArea = Integer.MIN_VALUE;

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

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0);
        System.out.println(maxSafeArea);
    }

    public static void solution(int wallNum) {

        if (wallNum == 3) {
            int foundSafeArea = solution2();
            maxSafeArea = Math.max(maxSafeArea, foundSafeArea);
            return;
        }

        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {

                if (map[i][j] != 0)
                    continue;

                if (!visited[i][j]) {
                    visited[i][j] = true;
                    solution(wallNum + 1);
                    visited[i][j] = false;
                }
            }
        }
    }

    public static int solution2() {

        int[][] copyMap = new int[map.length][map[0].length];

        for(int i=0; i<map.length; i++) {
            for (int j=0; j<map[0].length; j++) {
                copyMap[i][j] = map[i][j];
            }
        }

        boolean[][] copyVisited = new boolean[copyMap.length][copyMap[0].length];

        Queue<Location> queue = new LinkedList<>();
        for(int i=0; i<copyMap.length; i++) {
            for(int j=0; j<copyMap[0].length; j++) {
                if (!copyVisited[i][j] && copyMap[i][j] == 2) {
                    copyVisited[i][j] = true;
                    queue.add(new Location(i, j));
                    while(!queue.isEmpty()) {
                        Location location = queue.poll();
                        for(int k=0; k<4; k++) {
                            int nX = location.x + dx[k];
                            int nY = location.y + dy[k];

                            if(nX<0 || nX>=n || nY<0 || nY>=m)
                                continue;

                            if(!visited[nX][nY] && copyMap[nX][nY] == 0 && !copyVisited[nX][nY]) {
                                copyVisited[nX][nY] = true;
                                copyMap[nX][nY] = 2;
                                queue.add(new Location(nX, nY));
                            }
                        }
                    }
                }
            }
        }

        int foundSafeArea = 0;
        for(int i=0; i<copyMap.length; i++) {
            for (int j=0; j<copyMap[0].length; j++) {

                if (!visited[i][j] && copyMap[i][j] == 0 && !copyVisited[i][j]) {
                    copyVisited[i][j] = true;
                    foundSafeArea++;
                    queue.add(new Location(i, j));
                    while(!queue.isEmpty()) {
                        Location location = queue.poll();
                        for(int k=0; k<4; k++) {
                            int nX = location.x + dx[k];
                            int nY = location.y + dy[k];

                            if(nX<0 || nX>=n || nY<0 || nY>=m)
                                continue;

                            if(!visited[nX][nY] && copyMap[nX][nY] == 0 && !copyVisited[nX][nY]) {
                                copyVisited[nX][nY] = true;
                                foundSafeArea++;
                                queue.add(new Location(nX, nY));
                            }
                        }
                    }
                }
            }
        }
        return foundSafeArea;
    }
}
