import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String output = "";

        for(int i=input.length()-1; i>=0; i--) {
            char element = input.charAt(i);
            output += element;
        }

        if(input.equals(output))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
