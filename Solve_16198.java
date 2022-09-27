import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_16198 {

    static int N;
    static int[] arr;
    static boolean[] visited;
    static int maxEnergy = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(maxEnergy);
    }

    public static int findLeft(int i) {
        while(i>=0) {
            if (!visited[i])
                break;
            i--;
        }
        return i;
    }

    public static int findRight(int i) {
        while(i<=arr.length - 1) {
            if (!visited[i])
                break;
            i++;
        }

        return i;
    }

    public static void dfs(int level, int sum) {

        if (level == arr.length - 2) {
            maxEnergy = Math.max(maxEnergy, sum);
            return;
        }

        for (int i=1; i<arr.length-1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int leftIdx = findLeft(i);
                int rightIdx = findRight(i);
                dfs(level + 1, sum + (arr[leftIdx] * arr[rightIdx]));
                visited[i] = false;
            }
        }
    }
}
