import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_5430 {

    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {

            String inputTxt = br.readLine();
            char[] commends = inputTxt.toCharArray();
            int n = Integer.parseInt(br.readLine());
            String tmp = br.readLine();
            if (n == 0) {
                System.out.println("error");
                continue;
            }
            String[] inputArr = tmp.replace("[", "").replace("]", "").split(",");
            Deque<String> deque = new LinkedList<>();
            for (String ele : inputArr) {
                deque.add(ele);
            }

//            System.out.println("inputArr : " + Arrays.toString(inputArr));
//            System.out.println("i : " + i);
//            System.out.println("deque : " + deque.toString());
//            System.out.println("-----------------------------");
            System.out.println(solution(commends, deque));
        }
    }

    public static String solution(char[] commends, Deque<String> deque) {

        boolean isFront = true;
        for (char commend : commends) {

            if (commend == 'R') {
                isFront = !isFront;
                continue;
            }

            // D일때
            if (deque.isEmpty()) {
                System.out.println("error");
                break;
            }
            else {
                if (isFront)
                    deque.pollFirst();
                else
                    deque.pollLast();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(!deque.isEmpty()) {
            String number = deque.pollFirst();
            if (deque.isEmpty())
                sb.append(number);
            else
            sb.append(number).append(",");
        }
        sb.append("]");

        return sb.toString();
    }
}
