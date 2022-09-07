import java.io.*;
import java.util.*;

public class Solve_15659 {

    private static int N, minNumber=Integer.MAX_VALUE, maxNumber=Integer.MIN_VALUE;
    private static int[] numArr;
    private static int[] operatorArr;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        N = Integer.parseInt(br.readLine());
        String[] inputNumArr = br.readLine().split(" ");
        String[] inputOperatorArr = br.readLine().split(" ");

        numArr = new int[inputNumArr.length];
        for (int i=0; i<inputNumArr.length; i++) {
            numArr[i] = Integer.parseInt(inputNumArr[i]);
        }

        operatorArr = new int[inputOperatorArr.length];
        for (int i=0; i<inputOperatorArr.length; i++) {
            operatorArr[i] = Integer.parseInt(inputOperatorArr[i]);
        }

        arr = new int[N-1];
        solution(0);
        bw.write(maxNumber + "\n");
        bw.write(String.valueOf(minNumber));
        bw.flush();
    }

    public static void solution(int level) {

        if (level == N-1) {
            Deque<Integer> numberDeque = new LinkedList();
            Deque<Integer> operatorDeque = new LinkedList();

            numberDeque.add(numArr[0]);
            for(int i=0; i<arr.length; i++) {

                if (arr[i] == 2 || arr[i] == 3) {
                    int first = numberDeque.pollLast();
                    int second = numArr[i+1];
                    int result = 0;

                    if (arr[i] == 2)
                        result = first * second;
                    else
                        result = first / second;

                    numberDeque.add(result);
                }
                else {
                    operatorDeque.add(arr[i]);
                    numberDeque.add(numArr[i+1]);
                }
            }
            int answer = numberDeque.pollFirst();
            int step = operatorDeque.size();
            for(int i=0; i<step; i++) {

                int operator = operatorDeque.pollFirst();
                if (operator == 0) {
                    answer += numberDeque.pollFirst();
                }
                else {
                    answer -= numberDeque.pollFirst();
                }

            }
            minNumber = Math.min(minNumber, answer);
            maxNumber = Math.max(maxNumber, answer);
            return;
        }


        for (int i=0; i<operatorArr.length; i++) {

            if (operatorArr[i] > 0) {
                operatorArr[i]--;
                arr[level] = i;
                solution(level+1);
                operatorArr[i]++;
            }

        }
    }

}