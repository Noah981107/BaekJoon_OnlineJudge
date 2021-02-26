package coding_test;
import java.util.Scanner;
import java.util.Arrays;
public class Greedy_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[] min = new int[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			Arrays.sort(arr[i]);
			min[i] = arr[i][0];
		}
		Arrays.sort(min);
		System.out.print(min[n-1]);

	}

}
