package Arrays;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [0,3,2,1]
 * Output: true
 */

public class ValidMountainArray {
    public static void main(String args[]) {
        System.out.println(validMountainArray(new int[]{5, 6, 7, 2}));

    }

    public static boolean validMountainArray(int[] arr) {
        int i = 0;

        if (arr.length < 3) return false;
        while (arr[i] < arr[i + 1] && i < arr.length - 1) {
            i++;
        }
        if (i == arr.length - 1 || i == 0) return false;
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == arr.length - 1;
    }
}
