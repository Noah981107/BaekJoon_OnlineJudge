import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Solve_13277 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BigInteger X = sc.nextBigInteger();
        BigInteger Y = sc.nextBigInteger();

        System.out.println(X.multiply(Y));
    }
}
