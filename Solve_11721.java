import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = input.length() / 10;
        for(int i=0; i<n; i++) {
            int start = i*10;
            int end = start + 10;
            System.out.println(input.substring(start, end));
        }
        System.out.println(input.substring(n*10));
    }
}
