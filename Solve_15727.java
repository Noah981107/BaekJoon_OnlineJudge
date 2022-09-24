import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int answer = 0;
        answer += (t / 5);

        if (t % 5 != 0)
            answer += 1;

        System.out.println(answer);
    }

    public static void solution() {

    }
}
