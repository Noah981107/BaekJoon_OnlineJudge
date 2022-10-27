import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[Integer.parseInt(st.nextToken())] += 1;
        }

        int result = 0;
        for (int i=1; i<m+1; i++) {
            n -= arr[i];
            result += arr[i] * n;
        }

        System.out.println(result);
    }
}
