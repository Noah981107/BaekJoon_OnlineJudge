import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution2 {

    public static class Node implements Comparable<Node>{

        int index;
        int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            if (this.distance < o.distance)
                return -1;
            else
                return 1;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "index=" + index +
                    ", distance=" + distance +
                    '}';
        }
    }

    public static final int INF = (int) 1e9;
    public static int n, m, start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    public static int[] distanceTable;

    public static void dijkstra(int start) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Node(start, 0));
        distanceTable[start] = 0;
        while (!priorityQueue.isEmpty()) {
            Node node = priorityQueue.poll();
            int nowNodeIndex = node.index;
            int nowNodeDistance = node.distance;

            if (distanceTable[nowNodeIndex] < nowNodeDistance)
                continue;

            for (int i=0; i<graph.get(nowNodeIndex).size(); i++) {
                int cost = distanceTable[nowNodeIndex] + graph.get(nowNodeIndex).get(i).distance;

                if (cost < distanceTable[graph.get(nowNodeIndex).get(i).index]) {
                    distanceTable[graph.get(nowNodeIndex).get(i).index] = cost;
                    priorityQueue.offer(new Node(graph.get(nowNodeIndex).get(i).index, cost));
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

        distanceTable = new int[n + 1];

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Node>());
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
