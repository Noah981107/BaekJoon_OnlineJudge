import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = 0;
        int res=0;
        for(int i=0;i<10;i++) {
            int a = Integer.parseInt(br.readLine());
            if(s<100){
                s+=a;
                if(Math.abs(res-100)>Math.abs(s-100)) {
                    res = s;
                }else if(Math.abs(res-100)==Math.abs(s-100)) {
                    res = res>s? res:s;
                }
            }
        }
        System.out.println(res);
    }
}
