import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solve_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer result = solve(br.readLine());
        System.out.println(result);
    }

    public static Integer solve(String s){
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c =='('){
                stack.push(i);
            }
            else {
                int lastIdx = stack.pop();
                if (i - 1 == lastIdx) {
                    cnt += stack.size();
                }
                else{
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
}
