import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solve_3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<>();
            char[] input = br.readLine().toCharArray();
            for (char ele : input) {
                if (stack.isEmpty())
                    stack.add(ele);
                else {
                    if (stack.peek() == ele)
                        stack.pop();
                    else
                        stack.add(ele);
                }
            }

            if (stack.isEmpty())
                answer++;
        }
        System.out.println(answer);
    }
}
