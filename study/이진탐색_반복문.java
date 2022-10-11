public class BinarySearchLoop {
    public static void main(String[] args) {
        int[] input = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 14;

        int result = getTargetIndex(0, input.length-1, target, input);
        System.out.println(result);
    }

    public static int getTargetIndex(int start, int end, int target, int[] arr) {

        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid])
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return result;
    }
}
