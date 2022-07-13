import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solve_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[][] result = new Integer[N][2];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){

            String[] arr = br.readLine().split(" ");

            result[i][0] = Integer.parseInt(arr[0]);
            result[i][1] = Integer.parseInt(arr[1]);

        }
        Arrays.sort(result, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[0].equals(o2[0])) {
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0; i<N; i++) {
            sb.append(result[i][0] + " " + result[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
