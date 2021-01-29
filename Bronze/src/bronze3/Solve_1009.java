package bronze3;
import java.util.*;
import java.lang.Math;

public class Solve_1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    for(int i=0; i<num; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	int tmp = 1;
	    	for(int j=0; j<b; j++) {
	    		tmp *= a;
	    		tmp %=10;
	    	}
	    	if(tmp==0) tmp=10;
	    	System.out.println(tmp);
	    }
		sc.close();
	}
}
