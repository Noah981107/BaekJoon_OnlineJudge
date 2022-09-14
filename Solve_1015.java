import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solve_1015 {

    public static class Element {
        int num;
        int index;

        public Element(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }

    static int N;
    static Element[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new Element[N];
        int[] P = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            A[i] = new Element(Integer.parseInt(st.nextToken()), i);
        }

        Arrays.sort(A, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.num - o2.num;
            }
        });

        for(int i=0; i<A.length; i++) {
            P[A[i].index] = i;
        }

        StringBuilder sb = new StringBuilder();
        for(int ele : P) {
            sb.append(ele).append(" ");
        }

        System.out.println(sb);

    }
}
