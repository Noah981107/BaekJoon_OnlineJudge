package bronze2;
import java.util.Scanner;

public class Solve_1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr;
		while(true) {
			int count = 0;
			arr = sc.nextLine();
			if(arr == "#")
				break;
			arr.toLowerCase();
			for(int i=0; i<arr.length(); i++) {
				if(arr.charAt(i)=='a'||arr.charAt(i)=='e'||arr.charAt(i)=='i'||arr.charAt(i)=='o'||arr.charAt(i)=='u')
					count++;
                else 
                    continue;
			}
			System.out.println(count);
		}
	}
}
