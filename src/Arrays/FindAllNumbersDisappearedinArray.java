package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinArray {
    public static void main(String args[]) {
        System.out.println(findDisappearedNumbers(new int[]{1, 1, 1, 2, 4, 1}));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> lt = new ArrayList<>();

        int[] hashArray = new int[nums.length];

        for (int x : nums) {
            hashArray[x - 1]++;
        }
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] == 0) {
                lt.add(i + 1);
            }
        }
        return lt;

    }

}
