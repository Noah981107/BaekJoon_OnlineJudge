package bronze1;
import java.util.Scanner;
public class Solve_1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		boolean answer = false;
		
		for(int i=0; i<n; i++) {
			s[i] = sc.next();
		}
			
		for(int j=0; j<s[0].length(); j++) {
			answer = false;
			for(int i=0; i<n-1; i++) {
				if(s[i].charAt(j) != s[i+1].charAt(j)) {
					answer = true;
					break;
				}
					
			}
			if(answer)
				System.out.print("?");
			else 
				System.out.print(s[0].charAt(j));
		}
		sc.close();
	}

}
