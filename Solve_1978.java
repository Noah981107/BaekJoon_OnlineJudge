import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] li = br.readLine().split(" ");
        int cnt = 0;
        for(String ele : li) {
            int number = Integer.parseInt(ele);
            if(isPrime(number))
                cnt++;
        }
        System.out.println(cnt);
    }
    private static boolean isPrime(int x) {
        if(x < 2)
            return false;

        for(int i=2; i*i<=x; i++){
            if(x % i == 0)
                return false;
        }

        return true;
    }
}
