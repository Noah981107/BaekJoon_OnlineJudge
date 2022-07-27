import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_10808 {

    private static final int ALPHABET_NUM = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String txt = br.readLine();
        char[] arr = txt.toCharArray();

        int[] result = new int[ALPHABET_NUM];

        for(char ele : arr) {
            int idx = ele - 97;
            result[idx] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int value : result) {
            sb.append(value).append(" ");
        }

        System.out.println(sb);
    }

}
