import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int zeroGroupNum = 0;
        int oneGroupNum = 0;

        if (input.charAt(0) == '0')
            zeroGroupNum++;
        else
            oneGroupNum++;

        for (int i=1; i<input.length(); i++) {

            if (input.charAt(i - 1) != input.charAt(i)) {
                if (input.charAt(i) == '0')
                    zeroGroupNum++;
                else
                    oneGroupNum++;
            }
        }
        
        System.out.println(Math.min(zeroGroupNum, oneGroupNum));
    }
}
