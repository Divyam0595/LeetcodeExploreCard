package Arrays;

public class HeightChecker {
    public static void main(String args[]) {
        System.out.println(heightChecker(new int[]{1,2,4,6,7,3,4,8}));

    }
    static int heightChecker(int[] height) {
        int result=0;
        int []freq = new int[101];
        for(int h: height){
            freq[h]++;
        }
        int counter=0;
        for(int i=0;i<height.length;i++){
            while(freq[counter]==0){
                counter++;
            }
            if(counter!=height[i]){
                result++;
            }
            freq[counter]--;
        }
        return result;


    }
}
