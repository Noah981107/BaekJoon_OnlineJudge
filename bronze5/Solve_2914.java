import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int songs = sc.nextInt();
		int avg = sc.nextInt();
		int answer = 0;

		int total = songs * avg;
		for (int i = total; i >= 0; i--) {
			double temp = (double) i / (double) songs;
			int ans = (int) Math.ceil(temp);
			if (avg > ans) {
				answer = i + 1;
				break;
			}
		}
		System.out.println(answer);
	}
}