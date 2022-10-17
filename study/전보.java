import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution5 {

    static class Node implements Comparable<Node>{
        int index;
        int time;

        Node (int index, int time) {
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Node o) {
            if (this.time < o.time)
                return -1;
            return 1;
        }
    }

    static final int INF = (int) 1e9;
    static int N, M, C;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[] timeTable;

    public static void solution(int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>();
        timeTable[start] = 0;
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int nodeIndex = node.index;
            int nodeTime = node.time;

            if (timeTable[nodeIndex] < nodeTime)
                continue;

            for (int i=0; i<graph.get(nodeIndex).size(); i++) {
                int time = timeTable[nodeIndex] + graph.get(nodeIndex).get(i).time;

                if (time < timeTable[graph.get(nodeIndex).get(i).index]) {
                    timeTable[graph.get(nodeIndex).get(i).index] = time;
                    pq.offer(new Node(graph.get(nodeIndex).get(i).index, time));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        timeTable = new int[N + 1];
        Arrays.fill(timeTable, INF);

        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            graph.get(node1).add(new Node(node2, time));
        }

        solution(C);
        int maxTime = Integer.MIN_VALUE;
        int count = 0;
        for (int i=1; i<=N; i++) {

            if (timeTable[i] < INF)
                count++;
                maxTime = Math.max(maxTime, timeTable[i]);
        }

        System.out.println(count + " " + maxTime);
    }
}
