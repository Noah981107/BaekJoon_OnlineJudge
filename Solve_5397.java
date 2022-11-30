import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solve_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 0; testCase < T; testCase++) {
            Stack<Character> pre = new Stack<>();
            Stack<Character> post = new Stack<>();
            String input = br.readLine();
            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case '<':
                        if (!pre.isEmpty()) post.push(pre.pop());
                        break;
                    case '>':
                        if (!post.isEmpty()) pre.push(post.pop());
                        break;
                    case '-':
                        if (!pre.isEmpty()) pre.pop();
                        break;
                    default:
                        pre.push(input.charAt(i));
                        break;
                }
            }

            while (!post.isEmpty()) {
                pre.push(post.pop());
            }
            for (int i = 0; i < pre.size(); i++) {
                sb.append(pre.elementAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
