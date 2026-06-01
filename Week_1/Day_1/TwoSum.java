import  java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i, j, a;
        int[] ans = { -1, -1 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (i = 0; i < nums.length; i++) {
            int need = target-nums[i];
            if(map.containsKey(need)) {
                int index = map.get(need);
                ans[0]=i;
                ans[1]=index;
                return ans;
            }
            else map.put(nums[i],i);

        }
        return ans;
    }
}