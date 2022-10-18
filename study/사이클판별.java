import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3 {

    static int N, M;
    static int[] parent;

    public static int findParent(int node) {
        if (parent[node] != node)
            parent[node] = findParent(parent[node]);

        return parent[node];
    }

    public static void union(int node1, int node2) {
        int parent1 = findParent(node1);
        int parent2 = findParent(node2);

        if (parent1 < parent2)
            parent[node2] = parent1;
        else
            parent[node1] = parent2;
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

        boolean isCycle = false;
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            if (findParent(node1) == findParent(node2)) {
                isCycle = !isCycle;
                break;
            }
            else
                union(node1, node2);
        }

        if (isCycle)
            System.out.println("사이클이 발생했습니다.");
        else
            System.out.println("사이클이 발생하지 않았습니다.");

    }
}
