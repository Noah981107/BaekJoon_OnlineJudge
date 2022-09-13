import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_5014 {

    static int F, S, G, U, D, minMoving = Integer.MAX_VALUE;
    static int[] building;
    static boolean[] visited;
    static int[] move = new int[2];
    static int[] alreadyMoved;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        building = new int[F + 1];
        visited = new boolean[F+1];
        move[0] = U;
        move[1] = -D;
        alreadyMoved = new int[F + 1];

        solution(S);
    }

    public static void solution(int start) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        alreadyMoved[start] = 0;

        while(!queue.isEmpty()) {

            int floor = queue.poll();
            if (floor == G) {
                System.out.println(alreadyMoved[floor]);
                return;
            }

            for (int i=0; i<2; i++) {
                int nextFloor = floor + move[i];

                if (nextFloor<1 || nextFloor>F)
                    continue;

                if (!visited[nextFloor]) {
                    visited[nextFloor] = true;
                    queue.add(nextFloor);
                    alreadyMoved[nextFloor] = alreadyMoved[floor] + 1;
                }
            }
        }
        System.out.println("use the stairs");
    }
}
