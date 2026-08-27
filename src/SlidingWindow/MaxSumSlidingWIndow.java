package SlidingWindow;

public class MaxSumSlidingWIndow {

        public static int maxSlidingWindow(int k, int[] nums) {

            int maxSum=0;

            int windowSum=0;
            for(int i =0; i<k; i++){
                windowSum+=nums[i];
        }
        maxSum=windowSum;
        for(int j=k; j< nums.length; j++){

               windowSum= windowSum+nums[j];
               windowSum=windowSum-nums[j-k];

                maxSum=Math.max(windowSum,maxSum);


    }
return maxSum;}

    public static void main(String[] args) {
        MaxSumSlidingWIndow obj = new MaxSumSlidingWIndow();

        System.out.println(obj.maxSlidingWindow(2,new int[]{1,2,3,4}));
    }
}
