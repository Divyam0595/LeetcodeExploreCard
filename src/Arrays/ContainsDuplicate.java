package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String args[]) {
        System.out.println(hasDuplicate_Streams(new int[]{-5, -2, 3, 3, 6}));
    }

    static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : nums)
            if (!hs.add(x)) return true;
        return false;

    }

    static boolean hasDuplicate_Streams(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;

    }
}
