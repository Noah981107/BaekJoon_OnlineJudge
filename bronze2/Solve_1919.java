package bronze2;
import java.util.*;
public class Solve_1919 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();
		int[] alpha = new int[26];
		for(char c : str)
			alpha[c-97]++;
		for(char c : str2)
			alpha[c-97]--;
		System.out.print(Arrays.stream(alpha).map(i->Math.abs(i)).sum());;
	}

}
