import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int xStart = Integer.parseInt(st.nextToken());
            int yStart = Integer.parseInt(st.nextToken());
            int xEnd = Integer.parseInt(st.nextToken());
            int yEnd = Integer.parseInt(st.nextToken());

            System.out.println(find(arr, xStart, yStart, xEnd, yEnd));
        }
    }

    public static int find(int[][] arr, int xStart, int yStart, int xEnd, int yEnd) {
        int sum = 0;

        for(int i=xStart-1; i<xEnd; i++) {
            for(int j=yStart-1; j<yEnd; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }
}

