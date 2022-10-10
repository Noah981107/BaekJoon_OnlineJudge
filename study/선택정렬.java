import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] input = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        sort(input);
    }

    public static void sort(int[] arr) {

        int n = arr.length;

        int start = 0;
        while(start != n-1) {

            int minNumber = Integer.MAX_VALUE;
            int minIdx = n + 1;
            for (int i=start; i<arr.length; i++) {
                if (arr[i] < minNumber) {
                    minIdx = i;
                    minNumber = arr[i];
                }
            }

            int tmp = arr[start];
            arr[start] = arr[minIdx];
            arr[minIdx] = tmp;
            start++;
            System.out.println(Arrays.toString(arr));
            System.out.println("--------------------");
        }

    }
}
