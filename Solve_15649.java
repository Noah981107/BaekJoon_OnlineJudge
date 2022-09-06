import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_15649 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        boolean[] visited = new boolean[N+1];

        solution(0, arr, visited, N, M);

    }

    public static void solution(int index, int[] arr, boolean[] visited, int N, int M) {

        if (index == M) {
            for(int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=N; i++) {

            if (!visited[i]) {
                arr[index] = i;
                visited[i] = true;
                solution(index+1, arr, visited, N, M);
                visited[i] = false;
            }

        }
    }


}
