import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1 {

    static int N, M;
    static int[] parent;

    public static int findParent(int node) {
        if (parent[node] != node)
            return findParent(parent[node]);

        return node;
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

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];

        for (int i=1; i<=N; i++) {
            parent[i] = i;
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        System.out.println("<각 원소가 속한 집합>");
        for (int i=1; i<=N; i++) {
            System.out.print(findParent(i) + " ");
        }
        System.out.println("\n");

        System.out.println("<부모 노드>");
        for (int i=1; i<=N; i++) {
            System.out.print(parent[i] + " ");
        }

    }
}
