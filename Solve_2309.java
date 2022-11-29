import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solve_2309 {

    static List<Integer> arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<9; i++) {
            arr.add(Integer.parseInt(br.readLine()));
            sum += arr.get(i);
        }

        Collections.sort(arr);

        int bluff1 = -1;
        int bluff2 = -1;

        for (int i=0; i<arr.size(); i++) {
            for (int j=0; j<arr.size(); j++) {
                if (sum - arr.get(i) - arr.get(j) == 100) {
                    bluff1 = i;
                    bluff2 = j;
                    break;
                }
            }
        }

        for (int i=0; i<arr.size(); i++) {
            if (i == bluff1 || i == bluff2)
                continue;

            System.out.println(arr.get(i));
        }
    }
}
