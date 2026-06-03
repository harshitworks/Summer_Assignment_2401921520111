package Week_1.Day_3;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0 ;
        int k = 0  ;
        // shifting the non-zero babies forward
        while(l < n) {
            if(nums[l]!=0) {
                nums[k++]=nums[l];
            }

            l++;
        }
        // filling the last cell with 0
        while(k<n) {
            nums[k++]=0;
        }


    }
}
