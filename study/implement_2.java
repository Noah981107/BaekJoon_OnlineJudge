package coding_test;
import java.util.Scanner;
import java.util.StringTokenizer;

public class implement_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String location = sc.nextLine();
		int row = location.charAt(1)-'0';
		int col = location.charAt(0)-'a'+1;
		
		int[] dx = {-2,-2,2,2,-1,1,-1,1};
		int[] dy = {-1,1,-1,1,-2,-2,2,2};
		
		int result = 0;
		for(int i=0; i<dx.length; i++) {
			int nx = row + dx[i];
			int ny = col + dy[i];
			if(nx>=1 && nx<=8 && ny>=1 && ny<=8)
				result += 1;
		}
		System.out.println(result);
	}

}
