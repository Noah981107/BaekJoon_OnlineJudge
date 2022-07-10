import java.util.Scanner;

public class Solve_1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int cnt = 0;
        int i = 0;
        while(N != 0){
            if(N-i > 0){
                i++;
                N -= i;
            }
            else{
                i = 1;
                N -= i;
            }
            cnt++;
        }
        System.out.println(cnt);
    }        
}
