package Arrays;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsecutiveOnes {
    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x == 1){
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        return max;


    }


}
