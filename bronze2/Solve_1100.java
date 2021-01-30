package first;
import java.util.Scanner;
public class Solve_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[8][8];
		int result = 0;
		for(int i=0; i<8; i++) {
			String A = sc.nextLine();
			for(int j=0; j<8; j++) {
				arr[i][j] = A.charAt(j);
				if(arr[i][j] == 'F' && i%2==0 && j%2==0)
					result++;
				else if (arr[i][j]=='F'&& i%2!=0 && j%2!=0)
					result++;
			}
		}
		System.out.print(result);
		sc.close();
	}
}
