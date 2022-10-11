import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Question2 {

    static int N, M;
    static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int maxLength = -1;
        while (st.hasMoreTokens()) {
            int length = Integer.parseInt(st.nextToken());
            arr.add(length);
            maxLength = Math.max(maxLength, length);
        }

        Collections.sort(arr);

        int result = findCuttingLocation(0, maxLength);
        System.out.println(result);
    }

    public static int findCuttingLocation(int start, int end) {

        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            int afterCutting = cutting(mid);

            if (afterCutting == M) {
                result = mid;
                break;
            }
            else if (afterCutting > M)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return result;
    }

    public static int cutting(int cuttingLocation) {

        int result = 0;
        for (Integer ele : arr) {
            int tmp = ele - cuttingLocation;
            if (tmp > 0)
                result += tmp;
        }
        return result;
    }
}
