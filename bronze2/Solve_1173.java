package bronze2;
import java.util.Scanner;
public class Solve_1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counttime = 0;
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		int current = m;
		for(int i=N;N>0;) {
			counttime++;
			if(current+T<=M) {
				current += T;
				N--;
			}
			else {
				current -= R;
				if(current < m)
					current = m;
			}
			if(current + T > M && current == m) {
				System.out.println(-1);
				return;
			}
				
		}
		System.out.println(counttime);
		sc.close();
	}
}
