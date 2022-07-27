import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_15680 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(input.equals("0"))
            System.out.println("YONSEI");
        else
            System.out.println("Leading the Way to the Future");
    }
}
