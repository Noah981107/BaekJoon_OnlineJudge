import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_15664 {

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
            for (int ele : arr) {
                sb.append(ele).append(" ");
            }
            sb.append("\n");
            return;
        }

        int beforeNumber = 0;
        for (int i=start; i<inputArr.size(); i++) {
            if (beforeNumber != inputArr.get(i) && !visited[i]) {
                beforeNumber = inputArr.get(i);
                arr[index] = inputArr.get(i);
                visited[i] = true;
                solution( i + 1, index + 1);
                visited[i] = false;
            }
        }

    }
}
