import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Question3 {

    static int N, K;
    static List<Integer> aList = new ArrayList<>();
    static List<Integer> bList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        String[] aInput = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            aList.add(Integer.parseInt(aInput[i]));
        }

        String[] bInput = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            bList.add(Integer.parseInt(bInput[i]));
        }

        Collections.sort(aList);
        Collections.sort(bList);

        int aIndex = 0;
        int bIndex = bList.size() - 1;
        for (int i=0; i<K; i++) {

            if (aList.get(aIndex) < bList.get(bIndex)) {
                aList.remove(aIndex);
                aList.add(bList.get(bIndex));
                bIndex--;
            }
        }

        int sum = 0;
        for (Integer ele : aList)
            sum += ele;

        System.out.println(sum);
    }
}
