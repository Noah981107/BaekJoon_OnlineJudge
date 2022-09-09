import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solve_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        String[] input2 = br.readLine().split(" ");
        Integer[] arr = new Integer[input2.length];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[k-1]);
    }
}
