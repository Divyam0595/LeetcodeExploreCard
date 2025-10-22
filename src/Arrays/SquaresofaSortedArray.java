package Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresofaSortedArray {

    public static void main(String args[]) {
        System.out.println(sortedSquares(new int[]{-5, -2, 3, 6}));
    }

    public static int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[i] = nums[l] * nums[l];
                l++;
            } else {
                ans[i] = nums[r] * nums[r];
                r--;
            }


        }

        return ans;


    }
}
