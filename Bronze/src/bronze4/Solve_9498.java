package bronze4;
import java.util.Scanner;
public class Solve_9498 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=100 && n>=90)
            System.out.println("A");
        else if(n<=89 && n>=80)
            System.out.println("B");
        else if(n<=79 && n>=70)
            System.out.println("C");
        else if(n<=69 && n>=60)
            System.out.println("D");
        else
            System.out.println("F");
        sc.close();
	}
}
