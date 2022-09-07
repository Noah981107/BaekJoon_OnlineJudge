import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_15655 {

    private static int N;
    private static int M;
    private static List<Integer> inputArr = new ArrayList<>();
    private static int[] arr;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            inputArr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(inputArr);
        solution(0, 0);
        System.out.print(sb);
    }

    public static void solution(int start, int index) {

        if (index == M) {
            for (int element : arr) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=start; i<inputArr.size(); i++) {

            if (!visited[i]) {
                arr[index] = inputArr.get(start);
                visited[i] = true;
                solution(start+1, index + 1);
                visited[i] = false;
                start++;
            }

        }
    }
}
