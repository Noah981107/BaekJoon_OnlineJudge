import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2563 {

    static int N;
    static int[][] map = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());



        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int y=a; y<a+10; y++) {
                for (int x=b; x<b+10; x++) {
                    map[y -1 ][x - 1] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (map[i][j] == 1)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
