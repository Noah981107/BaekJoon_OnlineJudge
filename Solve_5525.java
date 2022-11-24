import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int patternCnt = 0;
        int result = 0;
        for (int i=1; i<input.length - 1; i++) {
            if (input[i - 1] == 'I' && input[i] == 'O' && input[i + 1] == 'I') {
                patternCnt++;
                if (patternCnt == N) {
                    patternCnt--;
                    result++;
                }
                i++;
            }
            else
                patternCnt = 0;
        }

        System.out.println(result);
    }
}
