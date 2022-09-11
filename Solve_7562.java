import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_7562 {

    private static int T;
    private static int[] movingX = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int[] movingY = {-2, -1, 1, 2, 2, 1, -1, -2};

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

        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t=0; t<T; t++) {

            int n = Integer.parseInt(br.readLine());
            String[] input1 = br.readLine().split(" ");
            int startX = Integer.parseInt(input1[0]);
            int startY = Integer.parseInt(input1[1]);
            String[] input2 = br.readLine().split(" ");
            int endX = Integer.parseInt(input2[0]);
            int endY = Integer.parseInt(input2[1]);
            int[][] map = new int[n][n];
            boolean[][] visited = new boolean[n][n];
            int[][] distance = new int[n][n];
            Queue<Location> queue = new LinkedList<>();

            visited[startX][startY] = true;
            distance[startX][startY] = 0;
            queue.add(new Location(startX, startY));

            while(!queue.isEmpty()) {
                Location location = queue.poll();

                if (location.x == endX && location.y == endY)
                    break;

                for(int i=0; i<movingX.length; i++) {

                    int nX = location.x + movingX[i];
                    int nY = location.y + movingY[i];

                    if (nX<0 || nX>=n || nY<0 || nY>=n)
                        continue;

                    if (!visited[nX][nY]) {
                        visited[nX][nY] = true;
                        queue.add(new Location(nX, nY));
                        distance[nX][nY] = distance[location.x][location.y] + 1;
                    }
                }
            }
            if (t == T-1)
                sb.append(distance[endX][endY]);
            else
                sb.append(distance[endX][endY]).append("\n");
        }
        System.out.println(sb);
    }
}
