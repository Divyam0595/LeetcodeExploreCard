package Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {
    public static void main(String args[]) {
        System.out.println(removeElement(new int[]{1, 0, 2, 0}, 0));
    }

    public static int removeElement_1(int[] nums, int val) {
        int k = 0;
        int counter = 0;

        for (int x : nums) {
            if (x == val) {
                counter++;
            } else {
                nums[k++] = x;
            }
        }
        return counter;

    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;

        for (int x : nums) {
            if (x != val) {
                nums[index++] = x;
            }
        }
        return index;
    }

}
