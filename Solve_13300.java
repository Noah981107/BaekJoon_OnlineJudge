import java.io.IOException;
import java.util.Scanner;

public class Solve_13300 {

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] girls=new int[7];
        int[] boys=new int[7];
        for (int i = 0; i < n; i++) {
            int s=sc.nextInt();
            int year=sc.nextInt();
            if(s==0) {
                girls[year]+=1;
            }else {
                boys[year]+=1;
            }
        }

        int cnt=0;
        for (int i = 1; i <= 6; i++) {
            if(girls[i]%k==0) {
                cnt+=girls[i]/k;
            }else {
                cnt+=girls[i]/k+1;
            }
            if(boys[i]%k==0) {
                cnt+=boys[i]/k;
            }else {
                cnt+=boys[i]/k+1;
            }
        }
        System.out.println(cnt);
    }
}
