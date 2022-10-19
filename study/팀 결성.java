import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1 {

    static int N, M;
    static int[] parent;

    public static int findParent(int team) {

        if (parent[team] != team)
            parent[team] = findParent(parent[team]);

        return parent[team];
    }

    public static void union(int team1, int team2) {
        team1 = findParent(team1);
        team2 = findParent(team2);

        if (team1 < team2)
            parent[team2] = team1;
        else
            parent[team1] = team2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];
        for (int i=1; i<=N; i++) {
            parent[i] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int team1 = Integer.parseInt(st.nextToken());
            int team2 = Integer.parseInt(st.nextToken());

            if (command == 0)
                union(team1, team2);
            else {
                if (findParent(team1) != findParent(team2)) {
                    sb.append("NO\n");
                }
                else
                    sb.append("YES\n");
            }
        }
        System.out.print(sb);
    }
}
