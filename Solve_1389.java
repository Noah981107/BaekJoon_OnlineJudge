import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_1389 {

    static int N, M;
    static int[][] friendShip;
    static final int INF = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        friendShip = new int[N + 1][N + 1];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int student1 = Integer.parseInt(st.nextToken());
            int student2 = Integer.parseInt(st.nextToken());

            friendShip[student1][student2] = 1;
            friendShip[student2][student1] = 1;
        }

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                if (i == j)
                    friendShip[i][j] = 0;
                else if (friendShip[i][j] == 0)
                    friendShip[i][j] = INF;
            }
        }

        for (int k=1; k<=N; k++) {
            for (int i=1; i<=N; i++) {
                for (int j=1; j<=N; j++) {
                    friendShip[i][j] = Math.min(friendShip[i][j], (friendShip[i][k] + friendShip[k][j]));
                }
            }
        }

        int minStudent = -1;
        int min = 100;
        for (int i=1; i<=N; i++) {
            int sum = 0;
            for (int j=1; j<=N; j++) {
                sum += friendShip[i][j];
            }
            if (sum < min) {
                minStudent = i;
                min = sum;
            }
            else if (sum == min) {
                minStudent = Math.min(minStudent, i);
            }
        }

        System.out.print(minStudent);
    }
}
