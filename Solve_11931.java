import java.io.*;

public class Solve_11931 {

    public static int[] arr;
    public static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, arr.length-1);
        printArray(arr);

    }

    public static void mergeSort(int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            int x = start;
            int y = mid + 1;
            int idx = x;

            while (x<=mid || y<= end) {
                if (y>end || (x<=mid && arr[x]<=arr[y]))
                    tmp[idx++] = arr[x++];
                else
                    tmp[idx++] = arr[y++];
            }

            for(int i=start; i<=end; i++) {
                arr[i] = tmp[i];
            }
        }
    }

    public static void printArray(int[] arr) throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=arr.length-1; i>=0; i--) {
            writer.write(arr[i]+"\n");
        }

        writer.flush();
    }

}
