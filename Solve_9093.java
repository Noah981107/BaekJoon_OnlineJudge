import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            System.out.println(solution(input));
        }
    }

    public static String solution(String input) {

        String[] tmp = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String ele : tmp) {
            for(int i=ele.length()-1; i>=0; i--) {
                sb.append(ele.charAt(i));
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}
