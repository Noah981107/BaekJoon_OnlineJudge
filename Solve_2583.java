import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_2583 {

    private static int N, M, K;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

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
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        Queue<Location> queue = new LinkedList<>();
        List<Integer> foundAreaList = new ArrayList<>();

        for (int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for (int x=b; x<d; x++) {
                for (int y=a; y<c; y++) {
                    map[x][y] = 1;
                }
            }
        }

        int devidedArea = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {

                if (map[i][j] == 1 || visited[i][j])
                    continue;

                devidedArea++;
                visited[i][j] = true;
                queue.add(new Location(i, j));

                int foundArea = 1;
                while (!queue.isEmpty()) {

                    Location location = queue.poll();
                    for(int k=0; k<dx.length; k++) {

                        int nX = location.x + dx[k];
                        int nY = location.y + dy[k];

                        if (nX<0 || nX>=N || nY<0 || nY>=M)
                            continue;

                        if (map[nX][nY] == 0 && !visited[nX][nY]) {
                            visited[nX][nY] = true;
                            queue.add(new Location(nX, nY));
                            foundArea++;
                        }
                    }
                }

                foundAreaList.add(foundArea);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(devidedArea).append("\n");
        Collections.sort(foundAreaList);

        for(Integer ele : foundAreaList) {
            sb.append(ele).append(" ");
        }

        System.out.println(sb);
    }
}
