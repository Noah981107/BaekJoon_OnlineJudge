import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_7795 {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0; t<T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int nA = Integer.parseInt(st.nextToken());
            int nB = Integer.parseInt(st.nextToken());

            List<Integer> arrA = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                arrA.add(Integer.parseInt(st.nextToken()));
            }

            List<Integer> arrB = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                arrB.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(arrB);

            int result = 0;
            for (int i=0; i<arrA.size(); i++) {

                int start = 0;
                int end = nB-1;
                int idx = 0;

                while(start <= end) {
                    int mid = (start + end) / 2;

                    if (arrB.get(mid) < arrA.get(i)) {
                        start = mid + 1;
                        idx = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
                result += idx;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}