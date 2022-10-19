import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solve_1647 {

    static class Edge implements Comparable<Edge>{
        int cost;
        int node1;
        int node2;

        public Edge(int cost, int node1, int node2) {
            this.cost = cost;
            this.node1 = node1;
            this.node2 = node2;
        }

        @Override
        public int compareTo(Edge o) {
            if (this.cost < o.cost)
                return -1;
            else if (this.cost > o.cost)
                return 1;
            else
                return 0;
        }
    }

    static int findParent(int node) {
        if (parent[node] == node)
            return node;
        return parent[node] = findParent(parent[node]);
    }

    static void union(int node1, int node2) {
        node1 = findParent(node1);
        node2 = findParent(node2);

        if (node1 < node2)
            parent[node2] = node1;
        else
            parent[node1] = node2;
    }

    static int N, M;
    static ArrayList<Edge> edges = new ArrayList<>();
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];
        for (int i=1; i<=N; i++) {
            parent[i] = i;
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            edges.add(new Edge(cost, node1, node2));
        }

        Collections.sort(edges);

        int result = 0;
        int maxEdgeCost = 0;
        for (int i=0; i<M; i++) {
            Edge now = edges.get(i);

            if (findParent(now.node1) != findParent(now.node2)) {
                union(now.node1, now.node2);
                maxEdgeCost = now.cost;
                result += now.cost;
            }
        }

        System.out.println(result - maxEdgeCost);
    }

}
