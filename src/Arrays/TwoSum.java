package Arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 * <p>
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 * <p>
 * Return the answer with the smaller index first.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * nums = [3,4,5,6], target = 7
 * <p>
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String args[]) {
       int arr[]=twoSum_1(new int[]{3, 5, 6, 4}, 10);
       System.out.println(arr);
    }

    static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hm.containsKey(diff) && hm.get(diff) != i) {
                return new int[]{i, hm.get(diff)};
            }
        }
        return new int[0];
    }

    static int[] twoSum_1(int[] nums, int target) {


        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n= nums[i];
            int diff= target-n;
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }
            hm.put(n,i);

        }
        return new int[0];
    }
}





