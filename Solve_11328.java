import java.io.*;

public class Solve_11328 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String first = input[0];
            String second = input[1];

            int[] alphabet = new int[26];
            boolean isPossible = true;

            for (int j = 0; j < first.length(); j++) {
                alphabet[(int)first.charAt(j)-97] +=1;
            }
            for (int j = 0; j < second.length(); j++) {
                alphabet[(int)second.charAt(j)-97] -=1;
            }

            for (int item : alphabet) {
                if(item != 0) {
                    isPossible = false;
                    break;
                }
            }

            bw.append(isPossible ? "Possible" : "Impossible");
            bw.newLine();
        }
        bw.flush();
    }
}
