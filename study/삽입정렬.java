import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] input = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        sort(input);
    }

    public static void sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
                else
                    break;
            }
            System.out.println("i : " + i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
