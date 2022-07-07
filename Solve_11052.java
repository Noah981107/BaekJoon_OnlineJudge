import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n+1];
        int[] maxValues = new int[n+1];

        cards[0] = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
            cards[i] = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                maxValues[i] = Math.max(maxValues[i], cards[j]+maxValues[i-j]);
            }
        }

        System.out.println(maxValues[n]);
    }
}
