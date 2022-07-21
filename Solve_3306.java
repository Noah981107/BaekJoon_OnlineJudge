import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int firstRing = arr[0];
        for(int i=1; i<N; i++){
            int gcd = gcd(firstRing, arr[i]);
            String txt = Integer.toString(firstRing/gcd) + '/' + arr[i]/gcd;
            sb.append(txt).append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b, a % b);
    }
}
