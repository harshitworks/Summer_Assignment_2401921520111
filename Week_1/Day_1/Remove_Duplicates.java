package Week_1.Day_1;

import java.util.*;

public class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int k =  1 ;
        if(nums[0]==nums[nums.length-1]) return 1;
        for(int i = 1 ; i < nums.length; i ++) {

            if(nums[i]>nums[i-1]) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k ;
    }
}