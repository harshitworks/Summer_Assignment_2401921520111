package Week_3.Day_3;

import java.util.*;

class Next_Greater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] next = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        Arrays.fill(next, -1) ;
        
        for(int i = 0 ; i< n ; i++) {
            map.put(nums2[i],i);
            while(!st.isEmpty() && nums2[st.peek()]< nums2[i]) {
                next[st.pop()]=nums2[i];
            }
            st.push(i);
        }
       
        int[] ans = new int[nums1.length];
        for(int i = 0 ; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            ans[i]=next[index];
        }
        return ans;
        
    }
}