import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_1697 {

    static int N;
    static int K;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        N = Integer.parseInt(tmp[0]);
        K = Integer.parseInt(tmp[1]);
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList();
        queue.add(start);
        visited[start] = 1;

        while(!queue.isEmpty()){
            int now = queue.poll();

            for(int i=0; i<3; i++){
                int nextLocation;

                if (i == 0) {
                    nextLocation = now + 1;
                } else if (i == 1) {
                    nextLocation = now - 1;
                } else {
                    nextLocation = now * 2;
                }

                if (nextLocation == K){
                    System.out.println(visited[now]);
                    return;
                }

                if (nextLocation >= 0 && nextLocation < visited.length && visited[nextLocation] == 0) {
                    queue.add(nextLocation);
                    visited[nextLocation] = visited[now] + 1;
                }

            }
        }
    }
}
