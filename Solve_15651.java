import java.io.*;
import java.util.StringTokenizer;

public class Solve_15651 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        boolean[] visited = new boolean[N+1];

        solution(0, arr, visited, N, M);
        System.out.println(sb);
    }

    public static void solution(int index, int[] arr, boolean[] visited, int N, int M) throws IOException {

        if (index == M) {
            for (int ele : arr) {
                sb.append(ele).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=1; i<=N; i++) {
            arr[index] = i;
            solution(index+1, arr, visited, N, M);
        }
    }
}
