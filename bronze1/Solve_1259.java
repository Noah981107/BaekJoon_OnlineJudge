package bronze1;
import java.util.*;
public class Solve_1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			int n = str.length();
			boolean check = false;
			if(str.charAt(0) =='0')
				break;
			for(int i=0; i<n/2; i++) {
				if(str.charAt(i)==str.charAt(n-1-i))
					check = true;
				else
					check = false;
			}
			if(check)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}
}
