import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1074 {

    static int N, R, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int len = (int) Math.pow(2, N);

        System.out.println(solution(0, 0, len));
    }

    public static int solution(int x, int y, int n) {
        if (n == 1) {
            return 0;
        }

        int nextSize = n / 2;

        if (R < x + nextSize && C < y + nextSize)
            return solution(x, y, nextSize);

        else if (R < x + nextSize && C < y + n)
            return solution(x, y + nextSize, nextSize) + (int) Math.pow(nextSize, 2);

        else if (R < x + n && C < y + nextSize)
            return solution(x + nextSize, y, nextSize) + (int) Math.pow(nextSize, 2) * 2;

        else
            return solution(x + nextSize, y + nextSize, nextSize) + (int) Math.pow(nextSize, 2) * 3;
    }
}
