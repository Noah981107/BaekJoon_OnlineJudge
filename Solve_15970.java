import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solve_15970 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            a.get(color).add(point);
        }

        // color가 있는 칸마다 오름차순 정렬.
        for (int i = 0; i <= N; i++) {
            Collections.sort(a.get(i));
        }

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (j == 0) { // 맨 처음
                    ans += a.get(i).get(j + 1) - a.get(i).get(j);
                } else if (j == a.get(i).size() - 1) { // 맨 끝
                    ans += a.get(i).get(j) - a.get(i).get(j - 1);
                } else { // 중간
                    int t = a.get(i).get(j + 1) - a.get(i).get(j);
                    int f = a.get(i).get(j) - a.get(i).get(j - 1);

                    ans += Math.min(t, f);
                }
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
