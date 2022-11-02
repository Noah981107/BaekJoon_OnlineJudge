import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_16139 {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        arr = new int[26][input.length()];
        int question = Integer.parseInt(br.readLine());

        init(input);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<question; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char alphabet = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int index = alphabet - 'a';
            if (l == 0)
                sb.append(arr[index][q] + "\n");
            else
                sb.append(arr[index][q] - arr[index][l - 1] + "\n");
        }
        System.out.print(sb);
    }

    public static void init(String input) {
        for (int i=0; i<26; i++) {

            if (input.charAt(0) == (char) ('a' + i))
                arr[i][0] = 1;

            for (int j=1; j<input.length(); j++) {
                if (input.charAt(j) == (char) ('a' + i))
                    arr[i][j] = arr[i][j-1] + 1;
                else
                    arr[i][j] = arr[i][j-1];
            }
        }
    }
}
