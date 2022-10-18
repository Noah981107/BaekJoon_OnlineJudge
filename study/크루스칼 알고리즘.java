import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution4 {

    static class Edge implements Comparable<Edge> {
        int distance;
        int node1;
        int node2;

        public Edge(int distance, int node1, int node2) {
            this.distance = distance;
            this.node1 = node1;
            this.node2 = node2;
        }

        @Override
        public int compareTo(Edge o) {
            if (this.distance < o.distance)
                return -1;
            return 1;
        }
    }

    static int v, e;
    public static int[] parent;
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result = 0;

    public static int findParent(int node) {
        if (parent[node] != node)
            parent[node] = findParent(parent[node]);

        return parent[node];
    }

    public static void union(int node1, int node2) {
        node1 = findParent(node1);
        node2 = findParent(node2);

        if (node1 < node2)
            parent[node2] = node1;
        else
            parent[node1] = node2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        parent = new int[v + 1];
        for (int i=1; i<=v; i++) {
            parent[i] = i;
        }

        for (int i=0; i<e; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            edges.add(new Edge(cost, node1, node2));
        }

        Collections.sort(edges);

        for (int i=0; i<edges.size(); i++) {
            int cost = edges.get(i).distance;
            int node1 = edges.get(i).node1;
            int node2 = edges.get(i).node2;

            if (findParent(node1) != findParent(node2)) {
                union(node1, node2);
                result += cost;
            }
        }

        System.out.println(result);
    }
}
