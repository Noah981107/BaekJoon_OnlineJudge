import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solve_2529 {

    private static int k;
    private static String[] input;
    private static int[] minNumArr, maxNumArr;
    private static boolean[] minNumVisited, maxNumVisited;
    private static int[] minNumTmp, maxNumTmp;
    private static List resultList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        minNumVisited = new boolean[k+1];
        maxNumVisited = new boolean[k+1];
        minNumArr = new int[k+1];
        maxNumArr = new int[k+1];
        minNumTmp = new int[k+1];
        maxNumTmp = new int[k+1];
        for(int i=0; i<=k; i++) {
            minNumArr[i] = i;
            maxNumArr[i] = 9-i;
        }

        solution(0, minNumArr, minNumVisited, minNumTmp);
        solution(0, maxNumArr, maxNumVisited, maxNumTmp);
        Collections.sort(resultList);
        System.out.println(resultList.get(resultList.size()-1));
        System.out.println(resultList.get(0));
    }

    public static void solution(int level, int[] numArr, boolean[] visited, int[] numArrTmp) {

        if (level == k+1) {

            for (int i=0; i<input.length; i++) {
                if (input[i].equals("<")) {
                    if (numArrTmp[i] > numArrTmp[i+1])
                        return;
                }
                else {
                    if (numArrTmp[i] < numArrTmp[i+1])
                        return;
                }
            }
            String number = "";
            for(int ele : numArrTmp) {
                number += ele;
            }
            resultList.add(number);
            return;
        }

        for (int i=0; i<numArr.length; i++) {
            if (!visited[i]) {
                numArrTmp[level] = numArr[i];
                visited[i] = true;
                solution(level + 1, numArr, visited, numArrTmp);
                visited[i] = false;
            }
        }
    }

}