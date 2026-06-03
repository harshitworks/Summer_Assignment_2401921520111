package Week_1.Day_3;

public class Squares_Sorted {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0 ;
        for(int i = 1 ; i< n ; i++) {
            if(Math.abs(nums[i-1])>Math.abs(nums[i])) {
                index = i ;
            }

        }

        int k = 0 ;
        ans[k++]=nums[index]*nums[index];

        int left = index -1 ;
        int right = index + 1;
        while(left>=0 && right< n) {
            if(nums[left]*nums[left]<nums[right]*nums[right]) {
                ans[k++]=nums[left]*nums[left];
                left--;
            }
            else {
                ans[k++]=nums[right]*nums[right];
                right++;

            }
        }
        while(left>=0) {
            ans[k++]=nums[left]*nums[left];
            left--;
        }
        while(right<n) {
            ans[k++]=nums[right]*nums[right];
            right++;

        }
        return ans;
    }
}
