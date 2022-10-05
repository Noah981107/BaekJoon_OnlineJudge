import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_1260 {

    static int N, M, V;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N + 1][N + 1];
        for (int i=0; i<M; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            map[x][y] = 1;
            map[y][x] = 1;
        }

        boolean[] dfsVisited = new boolean[N + 1];
        sb.append(V).append(" ");
        dfsVisited[V] = true;
        dfs(V, dfsVisited);
        sb.append("\n");

        boolean[] bfsVisited = new boolean[N + 1];
        bfs(V, bfsVisited);

        System.out.println(sb.toString());
    }

    public static void dfs(int startNode, boolean[] visited) {
        for (int i=1; i<N + 1; i++) {
            if (map[startNode][i] == 1 && !visited[i]) {
                visited[i] = true;
                sb.append(i).append(" ");
                dfs(i, visited);
            }
        }
    }

    public static void bfs(int start, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        sb.append(start).append(" ");
        while(!queue.isEmpty()) {
            int nowNode = queue.poll();
            for (int i=1; i<N+1; i++) {
                if (map[nowNode][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    sb.append(i).append(" ");
                    queue.add(i);
                }
            }
        }
    }
}
