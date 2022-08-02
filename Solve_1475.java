import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] arr = new int[10];

        for(char ele : input.toCharArray()) {
            int number = ele - '0';

            if (number == 9)
                number = 6;

            arr[number]++;
        }
        arr[6] = (arr[6] / 2) + (arr[6] % 2);
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
