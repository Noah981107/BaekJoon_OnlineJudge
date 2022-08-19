import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size1 = Integer.parseInt(st.nextToken());
        int size2 = Integer.parseInt(st.nextToken());

        List<Long> arr = new ArrayList<>();

        for(int i=0; i<2; i++) {
            String[] tmp = br.readLine().split(" ");

            for(String ele : tmp) {
                arr.add(Long.parseLong(ele));
            }
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(Long ele : arr) {
            sb.append(ele + " ");
        }

        System.out.println(sb);
    }
}
