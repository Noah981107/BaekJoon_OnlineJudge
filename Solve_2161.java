import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        while(queue.size() != 1){
            int first = queue.poll();
            sb.append(first).append(" ");
            int second = queue.poll();
            queue.offer(second);
        }

        sb.append(queue.poll());
        System.out.println(sb);
    }
}
