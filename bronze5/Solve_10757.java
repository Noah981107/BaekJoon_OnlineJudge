package bronze5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class Solve_10430 {

	public static void main(String[] args) {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String[] arr = br.readLine().split(" "); 
    System.out.println(new BigInteger(arr[0]).add(new BigInteger(arr[1])));
 

	}

}
