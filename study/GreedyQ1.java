package coding_test;
import java.util.*;
public class GreedyQ1 {
	
	public static int n;
	public static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		int result = 0;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			count += 1;
			if(count>=arr.get(i)) {
				result += 1;
				count = 0;
			}
		}
		
		System.out.println(result);

	}

}
