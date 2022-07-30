import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int winnerNum = 0;
        int winnerScore = 0;

        for(int i=1; i<6; i++) {
            int sum = 0;
            String[] tmp = br.readLine().split(" ");
            for(String ele : tmp) {
                sum += Integer.parseInt(ele);
            }

            if (sum > winnerScore) {
                winnerNum = i;
                winnerScore = sum;
            }
        }

        System.out.println(winnerNum + " " + winnerScore);
    }
}
