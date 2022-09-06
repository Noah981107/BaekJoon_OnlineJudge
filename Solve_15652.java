import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_15652 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N+1];

        solution(1, 0);
        System.out.println(sb);
    }

    public static void solution(int start, int index) {

        if (index == M) {
            for (int ele : arr) {
                sb.append(ele).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=start; i<=N; i++) {
            arr[index] = i;
            solution(start, index + 1);
            start++;
        }
    }
}
