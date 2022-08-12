import java.util.Scanner;

public class Solve_10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n*2; i++) {

            if((i % 2) != 0) {
                for(int j=1; j<=n; j++) {
                    if ((j%2) != 0)
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
                System.out.println();
            }

            else {
                for(int k=1; k<=n; k++) {
                    if((k%2) != 0)
                        System.out.print(' ');
                    else
                        System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}
