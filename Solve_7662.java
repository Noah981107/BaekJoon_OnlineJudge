import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Solve_7662 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=0; testCase<T; testCase++) {
            int N = Integer.parseInt(br.readLine());

            TreeMap<Integer, Integer> queue = new TreeMap<>();

            for (int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int number = Integer.parseInt(st.nextToken());

                if (command.equals("I")) {
                    queue.put(number, queue.getOrDefault(number, 0) + 1);
                }
                else {
                    if (!queue.isEmpty()) {
                        int key;
                        if (number == -1)
                            key = queue.firstKey();
                        else
                            key = queue.lastKey();

                        if (queue.get(key) == 1)
                            queue.remove(key);
                        else
                            queue.put(key, queue.get(key) - 1);
                    }
                }
            }

            if (queue.isEmpty())
                sb.append("EMPTY");
            else
                sb.append(queue.lastKey() + " " + queue.firstKey());

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
