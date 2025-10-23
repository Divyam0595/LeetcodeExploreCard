package Arrays;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 * Example 1:
 * <p>
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

public class DuplicateZeros {
    public static void main(String args[]) {
        duplicateZeros_withAdditionalFunction(new int[]{1, 0, 2, 0});
    }

    public static void duplicateZeros(int[] arr) {
        int tmp[] = arr.clone();
        int index = 0;
        int n = arr.length;

        for (int i = 0; index < n; i++) {
            arr[index++] = tmp[i];
            if (tmp[i] == 0 && index != n) {
                arr[index++] = 0;
            }

        }

    }

    static void duplicateZeros_1(int[] arr) {
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) zeros++;
        }
        int i = arr.length - 1, j = arr.length - 1 + zeros;
        while (i != j) {
            if (j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }

            j--;
            i--;
        }

    }


    static void duplicateZeros_withAdditionalFunction(int[] arr) {
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) zeros++;
        }
        int i = arr.length - 1, j = arr.length - 1 + zeros;

        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }

    }


    static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

}
