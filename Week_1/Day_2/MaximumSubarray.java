package Week_1.Day_2;

public class MaximumSubarray {
    public  int maximumSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int curr = 0 ;
        for(int num: nums) {
            curr+= num;
            max = Math.max(max, curr);
            if(curr<0) curr = 0 ;
        }
        return max;
    }
}
