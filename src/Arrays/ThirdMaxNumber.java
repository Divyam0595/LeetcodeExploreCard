package Arrays;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaxNumber {
    public static void main(String args[]) {
        System.out.println(thirdMax(new int[]{0, 1, 1, 1, 0, 2, 4, 0, 1}));
    }

    static int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) s.add(x);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j : s) {
            pq.add(j);
            if (pq.size() > 3) pq.poll();
        }
        if (pq.size() == 2) pq.poll();

        return pq.peek();
    }
}
