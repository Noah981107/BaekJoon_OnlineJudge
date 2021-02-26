package coding_test;
import java.util.Scanner;
public class implement_1_2 {
	public static boolean check(int h, int m, int s) {
		if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<60; j++) {
				for(int t=0; t<60; t++) {
					if(check(i,j,t))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
