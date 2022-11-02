import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_11660 {

    static int N, M;
    static int[][] map;
    static int[][] arr;
    static int[][] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        arr = new int[N][N];
        arr2 = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        init();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;

            int sum = arr2[y2][x2];
            if(x1 == 0 && y1 == 0);
            else if(x1 == 0)
                sum -= arr2[y1-1][x2];
            else if(y1 == 0)
                sum -= arr2[y2][x1-1];
            else{
                sum -= arr2[y2][x1-1] + arr2[y1-1][x2];
                sum += arr2[y1-1][x1-1];
            }

            sb.append(sum + "\n");
        }

        System.out.print(sb);
    }

    public static void init() {

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (j == 0)
                    arr[i][j] = map[i][j];
                else
                    arr[i][j] = arr[i][j-1] + map[i][j];
            }
        }

        for (int j=0; j<N; j++) {
            for (int i=0; i<N; i++) {
                if (i == 0)
                    arr2[i][j] = arr[i][j];
                else
                    arr2[i][j] = arr2[i-1][j] + arr[i][j];
            }
        }
    }
}
