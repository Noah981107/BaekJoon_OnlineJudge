import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int minNumber = 10000;
        int sum = 0;
        int cnt = 0;

        for(int i=M; i<=N; i++) {
            int a = (int) Math.sqrt(i);

            if (i == Math.pow(a, 2)) {
                if (a < minNumber)
                    minNumber = a;
                cnt++;
                sum += i;
            }
        }

        if(cnt == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println((int)Math.pow(minNumber, 2));
        }
    }
}
