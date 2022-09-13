import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1182 {

    static int N, S;
    static int[] arr;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for(int findSize=1; findSize<=N; findSize++) {
            int[] foundNumber = new int[findSize];
            boolean[] visited = new boolean[N];
            solution(0,0, foundNumber, visited);
        }

        System.out.println(result);
    }

    public static void solution(int start, int level, int[] foundNumber, boolean[] visited) {

        if (level == foundNumber.length) {
            int sum = 0;
            for(int i=0; i<foundNumber.length; i++) {
                sum += foundNumber[i];
            }

            if (sum == S)
                result++;
            return;
        }

        for(int i=start; i<arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                foundNumber[level] = arr[i];
                solution(i+1,level + 1, foundNumber, visited);
                visited[i] = false;
            }
        }

    }
}