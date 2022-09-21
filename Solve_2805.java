import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_2805 {

    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];


        long maxHeight = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (maxHeight < arr[i])
                maxHeight = arr[i];
        }
        long start = 0;

        while (start < maxHeight) {
            long mid = (maxHeight + start) / 2;
            long sum = 0;

            for(int value : arr) {
                if (value - mid > 0)
                    sum += (value - mid);
            }

            if (sum < M)
                maxHeight = mid;
            else
                start = mid + 1;
        }
        System.out.println(start - 1);
    }
}
