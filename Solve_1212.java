import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        for(int i=0; i<number.length(); i++){
            char ele = number.charAt(i);
            String tmp = Integer.toBinaryString(ele-'0');
            if(tmp.length()==2 && i!=0)
                tmp = '0' + tmp;
            else if(tmp.length()==1 && i!=0)
                tmp = "00" + tmp;

            sb.append(tmp);
        }

        System.out.println(sb);
    }
}
