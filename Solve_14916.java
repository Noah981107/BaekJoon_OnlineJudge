import java.util.Scanner;

public class Solve_14916 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if(n % 5 == 0) {
            System.out.println(n / 5);
        } else {
            while(true) {

                if(n < 0) {
                    System.out.println(-1);
                    break;
                }

                if(n == 0) {
                    System.out.println(count);
                    break;
                }

                n -= 2;
                count++;


                if(n % 5 == 0) {
                    count += n / 5;
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
