import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solve_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack();
        for(int i=0; i<n; i++){
            stack.push(Integer.parseInt(bf.readLine()));
        }

        int right = stack.pop();
        int cnt = 1;
        while(!stack.isEmpty()){
            int now = stack.pop();
            if(now > right){
                right = now;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
