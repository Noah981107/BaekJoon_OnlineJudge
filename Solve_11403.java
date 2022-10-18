import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solve_11403 {

    static int N;
    static int[][] graph, result;

    public static void solution(int start) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        boolean[] visited = new boolean[N];
        pq.add(start);

        while (!pq.isEmpty()) {
            Integer now = pq.poll();

            for (int next = 0; next<graph[now].length; next++) {
                if (graph[now][next] == 1) {
                    result[start][next] = 1;
                    if (!visited[next]) {
                        visited[next] = true;
                        pq.add(next);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        result = new int[N][N];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++) {
            solution(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
