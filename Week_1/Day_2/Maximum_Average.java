package Week_1.Day_2;

public class Maximum_Average {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0 ;
        int right = k ;
        double sum = 0 ;
        for(int i = left ; i<right; i++) {
            sum+=nums[i];
        }
        double ans = sum ;
        while(right < n ) {
            sum = sum - nums[left++] + nums[right++];
            ans = Math.max(ans,sum);

        }
        return ans/k;

    }
}
