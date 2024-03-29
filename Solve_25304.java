import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=0; i<N; i++) {
            String[] tmp = br.readLine().split(" ");
            sum += (Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[1]));
        }

        if (X == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
