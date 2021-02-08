package bronze1;
import java.util.Scanner;
public class Solve_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int buffer = n;
		int count = 0;
		
		while(true) {
			count++;
			int a = buffer / 10; // 10 의 자리 -> 2
			int b = buffer % 10; // 1의 자리 -> 6
			if(a+b>9)
				buffer = (b*10) + (a+b)%10;
			else
				buffer = (b*10) + (a+b);
			if(n == buffer)
				break;
		}
		System.out.println(count);
		sc.close();
	}
}
