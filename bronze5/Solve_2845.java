import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int person = sc.nextInt();
		int area = sc.nextInt();
		
		int []arr1 = new int[5];
		int []arr2 = new int[5];
		
		for(int i=0; i<5; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i] - (person * area);
			System.out.print(arr2[i] + " ");
		}
		
		sc.close();
	}

}