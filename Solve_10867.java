import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solve_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();

        for(String ele : tmp) {
            if(!arr.contains(Integer.parseInt(ele)))
                arr.add(Integer.parseInt(ele));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(Integer value : arr) {
            sb.append(value + " ");
        }

        System.out.println(sb);
    }
}
