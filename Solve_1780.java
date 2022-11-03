import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_1780 {

    static int N, minusOneCount = 0, zeroCount = 0, oneCount = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 0, N);

        System.out.println(minusOneCount);
        System.out.println(zeroCount);
        System.out.print(oneCount);
    }

    public static void solution(int x, int y, int n) {
        int nowPaper = map[x][y];

        for (int i=x; i<x + n; i++) {
            for (int j=y; j<y + n; j++) {
                if (nowPaper != map[i][j]) {
                    int split = n / 3;
                    int split2 = split * 2;

                    solution(x, y, split);
                    solution(x, y + split, split);
                    solution(x, y + split2, split);

                    solution(x + split, y, split);
                    solution(x + split, y + split, split);
                    solution(x + split, y + split2, split);

                    solution(x + split2, y, split);
                    solution(x + split2, y + split, split);
                    solution(x + split2, y + split2, split);
                    return;
                }
            }
        }

        if (nowPaper == -1)
            minusOneCount++;
        else if (nowPaper == 0)
            zeroCount++;
        else
            oneCount++;
    }
}
