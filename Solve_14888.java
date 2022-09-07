import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_14888 {

    private static int N;
    private static List<Integer> inputArr = new ArrayList<>();
    private static List<Integer> operators = new ArrayList<>();
    private static boolean[] operatorVisited;
    private static int[] arr;
    private static List<Queue> selectedOperatorList = new ArrayList<>();
    private static int maxNum = -1000000000;
    private static int minNum = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            inputArr.add(Integer.parseInt(st.nextToken()));
        }

        String[] tmp = br.readLine().split(" ");

        for(int i=0; i<tmp.length; i++) {
            for(int j=0; j<Integer.parseInt(tmp[i]); j++) {
                operators.add(i);
            }
        }

        operatorVisited = new boolean[operators.size()];
        arr = new int[operators.size()];

        solution(0);
        System.out.println(maxNum);
        System.out.println(minNum);
    }

    public static void solution(int level) {

        if (level == operators.size()) {
            int result = inputArr.get(0);
            int idx = 0;
            for (int i=1; i<inputArr.size(); i++) {
                result = calculate(result, arr[idx], inputArr.get(i));
                idx++;
            }
            if (result > maxNum)
                maxNum = result;
            if (result < minNum)
                minNum = result;
            return;
        }

        for(int i=0; i<operators.size(); i++) {
            if (!operatorVisited[i]) {
                arr[level] = operators.get(i);
                operatorVisited[i] = true;
                solution(level + 1);
                operatorVisited[i] = false;
            }
        }
    }

    public static int calculate(int result, int operator, int nextNumber) {

        switch (operator) {
            case 0 :
                result += nextNumber;
                break;
            case 1 :
                result -= nextNumber;
                break;
            case 2:
                result *= nextNumber;
                break;
            case 3:
                result /= nextNumber;
                break;
        }

        return result;
    }
}
