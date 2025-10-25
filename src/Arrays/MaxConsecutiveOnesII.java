package Arrays;

public class MaxConsecutiveOnesII {
    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int[]{0,1,1,1,0,1,1,0,1},2));

    }

    static int findMaxConsecutiveOnes(int[] nums,int n) {
        int l=0,ans=0,r,zeros=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0)zeros++;
            while(zeros>n){
                if(nums[l++]==0)zeros--;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;

    }
}

