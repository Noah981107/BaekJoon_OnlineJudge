import java.math.BigInteger;
import java.util.Scanner;

public class Solve_1252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger b1 = sc.nextBigInteger();
        BigInteger b2 = sc.nextBigInteger();

        String s1 = b1.toString();
        String s2 = b2.toString();
        
        BigInteger a = new BigInteger(s1, 2);
        BigInteger b = new BigInteger(s2, 2);

        BigInteger sum = a.add(b);

        String result = sum.toString(2);
        System.out.println(result);
    }
}