import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1629 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        long a = Integer.parseInt(input[0]);
        long b = Integer.parseInt(input[1]);
        long c = Integer.parseInt(input[2]);

        System.out.println(solution(a, b, c));
    }

    public static long solution(long a, long b, long c) {

        if (b == 1)
            return a % c;

        long temp = solution(a, b / 2, c) % c;

        if(b % 2 == 0)
            return (temp * temp) % c;
        else
            return (((temp * temp) % c) * a) % c;
    }
}