import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcdResult = gcd(a, b);
        System.out.println(gcdResult);
        System.out.println(lcm(a, b, gcdResult));
    }

    private static int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y, x%y);
    }

    private static long lcm(int x, int y, int gcdResult){
        return (x*y) / gcdResult;
    }
}
