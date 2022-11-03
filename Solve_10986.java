import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long answer = 0;
        long[] arr = new long[N + 1];
        long[] mod = new long[M];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<N + 1; i++) {
            arr[i] = arr[i - 1] + Long.parseLong(st.nextToken());

            if (arr[i] % M == 0)
                answer++;

            mod[(int) (arr[i] % M)] += 1;
        }

        for (int i=0; i<M; i++) {
            answer += (mod[i]* (mod[i]-1) / 2);
        }

        System.out.print(answer);
    }
}
