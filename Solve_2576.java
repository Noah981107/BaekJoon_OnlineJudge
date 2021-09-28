package bronze3;
import java.util.Scanner;
public class Solve_2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int count = 0;
		int result = 0;
		int min = 100;
		for(int i=0; i<7; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2 !=0) {
				count++;
				result += arr[i];
				if(arr[i]<min)
					min = arr[i];
			}
		}
		if(count == 0)
			System.out.println(-1);
		else {
			System.out.println(result);
			System.out.println(min);
		}
		sc.close();
	}
}
