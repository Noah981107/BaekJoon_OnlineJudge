import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        sort(input, 0, input.length -1 );
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int pivot = partition(arr, low, high);

        System.out.println("pivot : " + pivot);

        sort(arr, low, pivot);
        sort(arr, pivot + 1, high);

        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot)
                left++;

            while (arr[right] > pivot)
                right--;

            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;
            }
        }
        return pivot;
    }
}
