import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_14503 {

    public static class Robot {
        int x;
        int y;
        int direction;

        public Robot(int x, int y, int direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    private static int N, M;
    private static int[][] map;
    private static boolean[][] cleaned;

    //북, 동, 남, 서
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[] nextDirection = {3, 0, 1, 2};
    private static int[] backDirection = {2, 3, 0, 1};
    private static Queue<Robot> queue = new LinkedList<>();
    private static int cleanedArea = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        cleaned = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cleaned[r][c] = true;
        queue.add(new Robot(r, c, d));
        cleanedArea = 1;
        solution();
        System.out.println(cleanedArea);
    }

    public static void solution() {

        while(!queue.isEmpty()) {
            Robot r = queue.remove();
            int x = r.x;
            int y = r.y;
            int d = r.direction;

            int nDirection = d;
            boolean flag = false;
            for(int i = 0; i < 4; i++) {

                nDirection = nextDirection[nDirection];
                int nX = x + dx[nDirection];
                int nY = y + dy[nDirection];
                if(nX >= 0 && nY >= 0 && nX < N && nY < M) {
                    if(map[nX][nY] == 0 && !cleaned[nX][nY]) {
                        cleaned[nX][nY] = true;
                        queue.add(new Robot(nX,nY,nDirection));
                        cleanedArea++;
                        flag = true;
                        break;
                    }
                }
            }

            if(!flag) {
                int bDirection = backDirection[d];
                int bX = x + dx[bDirection];
                int bY = y + dy[bDirection];

                if(bX >= 0 && bY >= 0 && bX < N && bY < M) {
                    if(map[bX][bY] == 0) {
                        queue.add(new Robot(bX,bY,d));
                    }
                }
            }
        }
    }
}