import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int length = input.length();

        char[] target1 = input.substring(0, length / 2).toCharArray();
        char[] target2 = input.substring(length / 2).toCharArray();

        int sum = 0;
        for (char ele : target1)
            sum += (ele - '0');

        for (char ele : target2)
            sum -= (ele - '0');

        if (sum == 0)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
    }
}
