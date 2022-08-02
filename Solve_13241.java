import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        System.out.println(lcm(a, b));
    }
    public static long gcd(long x, long y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
    public static long lcm(long x, long y) {
        long gcdValue = gcd(x, y);
        return (x * y) / gcdValue;
    }
}
