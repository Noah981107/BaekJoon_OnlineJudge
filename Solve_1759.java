import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_1759 {

    static int L, C;
    static char[] arr;
    static boolean[] visited;
    static char[] found;
    static char[] tmp = {'a' , 'e', 'i', 'o', 'u'};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        visited = new boolean[C];
        found = new char[L];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        solution(0, 0);
        System.out.println(sb);
    }

    public static void solution(int start, int level) {

        if (level == L) {
            String result = "";
            int consonantNum, vowelNum = 0;
            for (char element : found) {
                for (int i=0; i<tmp.length; i++) {
                    if (element == tmp[i])
                        vowelNum += 1;
                }
                result += element;
            }
            consonantNum = found.length - vowelNum;
            if (vowelNum>=1 && consonantNum>=2)
                sb.append(result).append("\n");

            return;
        }

        for(int i=start; i<arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                found[level] = arr[i];
                solution(i + 1, level + 1);
                visited[i] = false;
            }
        }
    }

}
