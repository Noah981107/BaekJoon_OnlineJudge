import com.sun.deploy.net.MessageHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question1 {

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0 , 0};
    static int[] dy = {0 , 0, -1, 1};
    static Queue<Location> queue = new LinkedList<>();
    static int count  = 0;

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
        visited = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String input = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        bfs();

        for (boolean[] ele : visited)
            System.out.println(Arrays.toString(ele));

        System.out.println(count);
    }

    public static void bfs() {

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    queue.add(new Location(i , j));
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        Location location = queue.poll();

                        for (int k=0; k<4; k++) {
                            int nX = location.x + dx[k];
                            int nY = location.y + dy[k];

                            if (nX<0 || nX>=N || nY<0 || nY>=M)
                                continue;

                            if (map[nX][nY] == 0 && !visited[nX][nY]) {
                                queue.add(new Location(nX, nY));
                                visited[nX][nY] = true;
                            }
                        }
                    }
                    count++;
                }
            }
        }
    }
}
