import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size() != 1){
            for(int i=0; i<k-1; i++){
                int value = queue.remove();
                queue.offer(value);
            }
            sb.append(queue.remove()).append(", ");
        }

        sb.append(queue.remove()).append('>');
        System.out.println(sb);
    }
}
