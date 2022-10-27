import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solution(input);
    }

    public static void solution(String txt) {
        char[] arr = txt.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb1 = new StringBuilder();
        int number = 0;
        for (char ele : arr) {
            if (ele >= 'A' && ele <= 'Z')
                sb1.append(ele);
            else
               number += (ele - '0');
        }
        System.out.println(sb1.toString() + number);
    }
}
