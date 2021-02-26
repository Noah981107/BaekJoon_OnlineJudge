package coding_test;

public class Greedy_1 {

	public static void main(String[] args) {
		int n = 1260;
		int[] money = {500,100,50,10};
		int count = 0;
		
		for(int i=0; i<money.length; i++) {
			count += (n/money[i]);
			n %= money[i];
		}
		System.out.println(count);
	}

}
