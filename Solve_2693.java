import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solve_2693 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T= Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            List arr = new ArrayList();
            String[] tmp = br.readLine().split(" ");
            for(String value : tmp) {
                arr.add(Integer.parseInt(value));
            }

            Collections.sort(arr);
            System.out.println(arr.get(arr.size() - 3));
        }
    }
}
