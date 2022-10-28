import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_24445 {

    static int n, m ,r, cnt = 1;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visited = new int[n + 1];
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (ArrayList<Integer> ele : graph)
            Collections.sort(ele, Collections.reverseOrder());

        bfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<visited.length; i++) {
            sb.append(visited[i] + "\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = cnt++;
        queue.add(start);
        while (!queue.isEmpty()) {
            Integer node = queue.poll();

            for (Integer nextNode : graph.get(node)) {
                if (visited[nextNode] == 0) {
                    visited[nextNode] = cnt++;
                    queue.add(nextNode);
                }
            }
        }
    }
}
