import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] li = new boolean[N+1];
        li[0] = li[1] = true;

        for(int i=2; i*i<=N; i++){
            if(!li[i]){
                for(int j=i*i; j<=N; j+=i){
                    li[j] = true;
                }
            }
        }

        for(int i = M; i <= N; i++) {
            if(!li[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
        
    }
}
