import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            for (int left=1; left<=i; left++)
                System.out.print("*");

            for (int mid=1; mid<=(2 * N) - (2 * i); mid++)
                System.out.print(" ");

            for (int right=1; right<=i; right++)
                System.out.print("*");

            System.out.println();
        }

        for (int i=N-1; i>=1; i--) {
            for (int left=1; left<=i; left++)
                System.out.print("*");

            for (int mid=1; mid<=(2 * N) - (2 * i); mid++)
                System.out.print(" ");

            for (int right=1; right<=i; right++)
                System.out.print("*");

            System.out.println();
        }


    }
}
