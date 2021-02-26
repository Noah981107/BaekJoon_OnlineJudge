package coding_test;

import java.util.Scanner;
import java.util.Arrays;
public class Greedy_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		int max = num[n-1];
		int second = num[n-2];
		
		int count = (m/(k+1))*k;
		count += m%(k+1);
		
		int result = 0;
		result += count * max;
		result += (m-count)*second;
		System.out.println(result);
		
	}

}
