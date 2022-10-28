import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solve_24480 {

    static int n, m, r, cnt = 1;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visited = new int[n + 1];
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
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

        dfs(r);
        for (int i=1; i<visited.length; i++) {
            if (i == visited.length - 1)
                sb.append(visited[i]);
            else
                sb.append(visited[i] + "\n");
        }

        System.out.print(sb);
    }

    public static void dfs(int start) {
        visited[start] = cnt++;
        for (Integer node : graph.get(start)) {
            if (visited[node] == 0) {
                dfs(node);
            }
        }
    }
}
