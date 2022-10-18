import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution5 {

    static int v, e;
    static int[] inDegree;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void topologySort() {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=v; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            result.add(now);

            for (int i=0; i<graph.get(now).size(); i++) {
                inDegree[graph.get(now).get(i)] -= 1;

                if (inDegree[graph.get(now).get(i)] == 0)
                    queue.offer(graph.get(now).get(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer ele : result) {
            sb.append(ele + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        inDegree = new int[v + 1];

        for (int i=0; i<=v; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<e; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            graph.get(node1).add(node2);
            inDegree[node2] += 1;
        }

        topologySort();
    }
}
