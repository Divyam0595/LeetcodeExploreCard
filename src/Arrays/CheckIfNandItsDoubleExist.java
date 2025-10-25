package Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * <p>
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */
public class CheckIfNandItsDoubleExist {
    public static void main(String args[]) {
        System.out.println(checkIfExist(new int[]{10, 2, 5, 3}));

    }

    public static boolean checkIfExist(int[] arr) {

        Set<Integer> s = new HashSet<>();
        for (int x : arr) {
            if (s.contains(x) || s.contains(2 * x)) {
                return true;
            }
            s.add(x);
        }
        return false;
    }
}
