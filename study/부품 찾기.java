import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1 {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        List<Integer> myList = new ArrayList<>();
        String[] myInput = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            myList.add(Integer.parseInt(myInput[i]));
        }

        Collections.sort(myList);

        M = Integer.parseInt(br.readLine());
        List<Integer> customerList = new ArrayList<>();
        String[] customerInput = br.readLine().split(" ");
        for (int i=0; i<M; i++) {
            customerList.add(Integer.parseInt(customerInput[i]));
        }

        StringBuilder sb = new StringBuilder();
        for (Integer element : customerList) {
            boolean result = find(0, myInput.length - 1, element, myList);
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }

    public static boolean find(int start, int end, int target, List<Integer> arr) {

        if (start > end)
            return false;

        int mid = (start + end) / 2;

        if (target == arr.get(mid))
            return true;
        else if (target < arr.get(mid))
            return find(start, mid - 1, target, arr);
        else
            return find(mid + 1, end, target, arr);
    }
}
