import java.io.*;

public class Solve_15658 {

    private static int N;
    private static int maxNum = Integer.MIN_VALUE;
    private static int minNum = Integer.MAX_VALUE;
    private static int[] numberArr;
    private static int[] operatorArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        String[] inputNumberArr = br.readLine().split(" ");
        String[] inputOperatorArr = br.readLine().split(" ");

        numberArr = new int[inputNumberArr.length];
        operatorArr = new int[inputOperatorArr.length];

        for(int i=0; i< inputNumberArr.length; i++) {
            numberArr[i] = Integer.parseInt(inputNumberArr[i]);
        }

        for(int i=0; i<inputOperatorArr.length; i++) {
            operatorArr[i] = Integer.parseInt(inputOperatorArr[i]);
        }

        solution(1, numberArr[0]);

        bw.write(String.valueOf(maxNum) + "\n");
        bw.write(String.valueOf(minNum));
        bw.flush();
    }

    public static void solution(int level, int result) {

        if (level == N) {
            maxNum = Math.max(maxNum, result);
            minNum = Math.min(minNum, result);
            return;
        }

        for(int i=0; i<operatorArr.length; i++) {
            if (operatorArr[i] > 0) {
                operatorArr[i]--;
                if (i==0)
                    solution(level + 1, result + numberArr[level]);
                else if (i==1)
                    solution(level + 1, result - numberArr[level]);
                else if (i==2)
                    solution(level + 1, result * numberArr[level]);
                else
                    solution(level + 1, result / numberArr[level]);
                operatorArr[i]++;
            }
        }
    }

}
