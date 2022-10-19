import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        String[] input = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;
        int groupNum = 0;
        for (int i=0; i<n; i+=groupNum) {
            groupNum = arr[i];
            result++;
        }

        System.out.println(result);
    }
}
