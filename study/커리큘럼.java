import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    static int N;
    static int[] inDegrees;
    static int[] lectureTimes;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void typoSort() {
        int[] result = new int[N + 1];
        for (int i=1; i<=N; i++)
            result[i] = lectureTimes[i];

        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            if (inDegrees[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i=0; i<graph.get(now).size(); i++) {
                result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)], result[now] + lectureTimes[graph.get(now).get(i)]);
                inDegrees[graph.get(now).get(i)] -= 1;
                if (inDegrees[graph.get(now).get(i)] == 0)
                    queue.offer(graph.get(now).get(i));
            }
        }

        for (int i=1; i<=N; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        inDegrees = new int[N + 1];
        lectureTimes = new int[N + 1];

        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=1; i<=N; i++) {
            String[] input = br.readLine().split(" ");
            int lectureTime = Integer.parseInt(input[0]);
            lectureTimes[i] = lectureTime;
            for (int j=1; j<input.length; j++) {
                if (input[j].equals("-1"))
                    break;
                graph.get(j).add(i);
                inDegrees[i] += 1;
            }
        }

        typoSort();
    }
}
