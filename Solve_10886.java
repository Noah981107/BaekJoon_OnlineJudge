import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int zeroNum = 0;
        int oneNum = 0;
        for(int i=0; i<N; i++) {
            int opinion = Integer.parseInt(br.readLine());
            if (opinion == 0)
                zeroNum++;
            else
                oneNum++;
        }

        if (zeroNum > oneNum)
            System.out.println("Junhee is not cute!");
        else
            System.out.println("Junhee is cute!");

    }
}
