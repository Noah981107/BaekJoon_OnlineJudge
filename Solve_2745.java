import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        for(int i=0; i<number.length(); i++){
            if ('0' <= number.charAt(i) && number.charAt(i) <= '9'){
                result = result*b + ((int)number.charAt(i) - (int)'0');
            }
            else{
                result = result*b + ((int)number.charAt(i) - (int)'A' + 10);
            }
        }

        System.out.println(result);
    }
}
