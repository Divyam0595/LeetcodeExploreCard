package Arrays;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Example 1:
 * <p>
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 * <p>
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */
public class FindNumberswithEvenNumberofDigits {

    public static void main(String args[]) {
        System.out.println(findNumbers(new int[]{12, 1, 4356, 134343, 13}));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int digits ;
        for (int x : nums) {
            digits = digitCount(x);
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int digitCount(int num) {
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }

}
