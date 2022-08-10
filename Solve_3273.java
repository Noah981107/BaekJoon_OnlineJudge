import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arr = new int[n];

        for(int i=0; i<input.length; i++)
            arr[i] = Integer.parseInt(input[i]);

        Arrays.sort(arr);

        int start = 0;
        int end = n-1;

        while(start < end) {
            int sum = arr[start] + arr[end];
            if(sum == x) {
                end--;
                start++;
                answer++;
            }
            else if(sum > x)
                end--;
            else
                start++;
        }

        System.out.println(answer);
    }
}
