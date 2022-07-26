import java.util.Scanner;

public class Solve_10768 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();
        if (m < 2)
            System.out.println("Before");
        else if (m == 2){
            if (d < 18)
                System.out.println("Before");
            else if (d > 18)
                System.out.println("After");
            else
                System.out.println("Special");
        }
        else
            System.out.println("After");
    }
}
