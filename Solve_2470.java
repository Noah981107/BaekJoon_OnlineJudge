import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_2470 {

    static int N;
    static List<Integer> arr = new ArrayList<>();
    static int minDifferent = Integer.MAX_VALUE;
    static int element1, element2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        find(0, arr.size() - 1);

        StringBuilder sb = new StringBuilder();
        sb.append(element1).append(" ").append(element2);
        System.out.println(sb);
    }

    public static void find(int left, int right) {

        while (left < right) {

            int different = arr.get(left) + arr.get(right);

            if (Math.abs(different) < minDifferent) {
                minDifferent = Math.abs(different);
                element1 = arr.get(left);
                element2 = arr.get(right);
            }

            if (different > 0)
                right--;
            else
                left++;
        }
    }
}
