package coding_test;
import java.util.Scanner;
public class GCD {
	
	public static int cal(int x, int y) {
		if(y==0) {
			return x;
		}
		else {
			return cal(y, x%y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(cal(a,b));
	}

}
