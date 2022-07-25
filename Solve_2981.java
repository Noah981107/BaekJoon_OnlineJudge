import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcd_val = arr[1] - arr[0];
        for(int i=2; i<n; i++)
            gcd_val = gcd(gcd_val, arr[i] - arr[i-1]);

        for(int i=2; i<=gcd_val; i++) {
            if(gcd_val % i == 0) {
                System.out.println(i + " ");
            }
        }

    }
    private static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
