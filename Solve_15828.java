import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_15828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxBufferSize = Integer.parseInt(br.readLine());
        Queue<Integer> buffer = new LinkedList<>();

        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input == -1)
                break;
            else if (input == 0)
                buffer.poll();
            else {
                if (buffer.size() < maxBufferSize)
                    buffer.add(input);
            }

        }

        StringBuilder sb = new StringBuilder();
        if (buffer.isEmpty())
            System.out.println("empty");
        else {
            while (!buffer.isEmpty())
                sb.append(buffer.poll() + " ");
            System.out.println(sb);
        }
    }
}
