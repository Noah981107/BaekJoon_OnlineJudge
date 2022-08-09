import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        int a1 = Integer.parseInt(input1[0]);
        int b1 = Integer.parseInt(input1[1]);

        String[] input2 = br.readLine().split(" ");
        int a2 = Integer.parseInt(input2[0]);
        int b2 = Integer.parseInt(input2[1]);

        int denominator = lcm(b1, b2, gcd(b1, b2));
        int numerator = (a1 * (denominator / b1)) + (a2 * (denominator / b2));

        int fractionGcdValue = gcd(denominator, numerator);
        denominator /= fractionGcdValue;
        numerator /= fractionGcdValue;

        StringBuilder sb = new StringBuilder();
        sb.append(numerator).append(" ").append(denominator);
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcdValue) {
        return a * b / gcdValue;
    }
}
