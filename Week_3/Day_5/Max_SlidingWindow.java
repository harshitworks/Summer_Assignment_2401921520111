package Week_3.Day_5;
import java.util.*;



class Max_SlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0 ; i< k && i<n ; i++) {
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.pollLast();
            }
            dq.addLast(nums[i]);
        }
        int left = 0 ;
        if(!dq.isEmpty()) ans[0]= dq.peekFirst();

        for(int i = k ; i < n ; i++ ){
            int prev = nums[left++];
            if(!dq.isEmpty() && prev==dq.peekFirst()) dq.pollFirst();

            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.pollLast();
            }
            dq.addLast(nums[i]);
            if(!dq.isEmpty()) ans[left]= dq.peekFirst();
        }
        return ans;

    }
}