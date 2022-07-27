import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String txt = br.readLine();

            if(txt.equals("END"))
                break;

            for(int i=txt.length()-1; i>=0; i--) {
                sb.append(txt.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
