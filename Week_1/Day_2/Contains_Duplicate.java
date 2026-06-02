package Week_1.Day_2;

import java.util.*;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]) return true;
        }
        return false ;
        // another approach without sorting is using the set and return true if a value already exist.
    }
}
