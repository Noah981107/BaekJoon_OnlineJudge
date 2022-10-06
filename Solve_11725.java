import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_11725 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i=0; i<=N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i=0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            tree.get(node1).add(node2);
            tree.get(node2).add(node1);
        }

        boolean[] visited = new boolean[N + 1];
        int[] parent = new int[N + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            for (int node : tree.get(nowNode)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    parent[node] = nowNode;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=2; i<=N; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);
    }

}
