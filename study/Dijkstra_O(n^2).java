import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1 {

    static class Node {

        int index;
        int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    public static final int INF = (int) 1e9;
    public static int n, m, start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    public static boolean[] visited;
    public static int[] distanceTable;

    public static int getSmallestNode() {
        int minValue = Integer.MAX_VALUE;
        int index = 0;

        for (int i=1; i<=n; i++) {
            if (distanceTable[i] < minValue && !visited[i]) {
                minValue = distanceTable[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
        distanceTable[start] = 0;
        visited[start] = true;
        for (int i=0; i<graph.get(start).size(); i++) {
            distanceTable[graph.get(start).get(i).index] = graph.get(start).get(i).distance;
        }

        for (int i=0; i<n-1; i++) {
            int nowNodeIndex = getSmallestNode();
            visited[nowNodeIndex] = true;

            for (int j=0; j < graph.get(nowNodeIndex).size(); j++) {
                int cost = distanceTable[nowNodeIndex] + graph.get(nowNodeIndex).get(j).distance;

                if (cost < distanceTable[graph.get(nowNodeIndex).get(j).index]) {
                    distanceTable[graph.get(nowNodeIndex).get(j).index] = cost;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        distanceTable = new int[n + 1];

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(startNode).add(new Node(endNode, cost));
        }

        Arrays.fill(distanceTable, INF);

        dijkstra(start);

        for (int i=1; i<=n; i++) {
            if (distanceTable[i] == INF)
                System.out.println("INFINITY");
            else
                System.out.println(distanceTable[i]);
        }
    }
}
