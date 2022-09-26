import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solve_1339 {

    static int N;
    static Integer[] alphabet = new Integer[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        Arrays.fill(alphabet, 0);
        for (int i=0; i<N; i++) {
            String input = br.readLine();
            double multi = 0;
            for (int j=input.length() - 1; j>=0; j--) {
                alphabet[input.charAt(j) - 'A'] += (int) Math.pow(10, multi);
                multi++;
            }
        }

        Arrays.sort(alphabet, Collections.reverseOrder());

        int alphabetNum = 0;
        for (int number : alphabet)
            if (number != 0)
                alphabetNum++;

        int answer = 0;

        for (int i=9; i>9-alphabetNum; i--) {
            answer += (i * alphabet[9-i]);
        }

        System.out.println(answer);
    }
}
