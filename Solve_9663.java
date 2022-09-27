import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_9663 {

    static int N;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        solution(0);
        System.out.println(cnt);
    }

    public static void solution(int level) {

        if (level == N) {
            cnt++;
            return;
        }

        for (int i=0; i<N; i++) {
            arr[level] = i;
            if (check(level)) {
                solution(level + 1);
            }
        }
    }

    public static boolean check(int col) {

        for (int i=0; i<col; i++) {
            if (arr[col] == arr[i])
                return false;
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i]))
                return false;
        }
        return true;
    }
}
