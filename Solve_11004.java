import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solve_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);
        String[] inputArr = br.readLine().split(" ");

        ArrayList li = new ArrayList();
        for(String value : inputArr) {
            li.add(Integer.parseInt(value));
        }

        Collections.sort(li);
        System.out.println(li.get(K-1));
    }
}
