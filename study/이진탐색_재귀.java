public class BinarySearchRecur {

    public static void main(String[] args) {
        int[] input = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 14;

        int result = getTargetIndex(0, input.length-1, target, input);
        System.out.println(result);
    }

    public static int getTargetIndex(int start, int end, int target, int[] input) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (target == input[mid])
            return mid;
        else if (target < input[mid])
            return getTargetIndex(start, mid-1, target, input);
        else
            return getTargetIndex(mid + 1, end, target, input);
    }
}
