import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_2559 {

    private static int N;
    private static int K;
    private static List<Integer> temperatures = new ArrayList<>();
    private static int maxTemperature = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        String[] input = br.readLine().split(" ");
        for(String value : input)
            temperatures.add(Integer.parseInt(value));

        for (int i=0; i<=temperatures.size()-K; i++) {

            int sum = 0;
            for(int j=i; j<i+K; j++) {
                sum += temperatures.get(j);
            }

            if (sum > maxTemperature)
                maxTemperature = sum;
        }

        bw.write(String.valueOf(maxTemperature));
        bw.flush();
    }
}
