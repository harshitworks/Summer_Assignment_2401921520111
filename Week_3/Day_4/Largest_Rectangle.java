package Week_3.Day_4;
import java.util.*;

class Largest_Rectangle {
    public int largestRectangleArea(int[] heights) {
        return largest(heights, nextsmaller(heights), presmaller(heights));

    }
    public static int largest(int[] arr, int[] next, int[] pre) {
        int n = arr.length;
        int max = 0 ;
        for(int i = 0 ; i < n ; i++) {
            int area = 0;
            int height = arr[i];
            int width = next[i]-pre[i]-1;   // the idea is we are calclating the area for every height and considering its left most and right most index which is greater or equals to that element so that we can extend our width upto the point :
            area = height*width;
            max = Math.max(area, max);
        }
        return max ;

    }
     public static int[] nextsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        Arrays.fill(next, arr.length);
        for (int i = 0; i < arr.length; i++) {

            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                int index = st.pop();
                next[index]=i;

            }
            st.push(i);
        }
        return next;
    }
    public static int[] presmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        Arrays.fill(next, -1);
        for (int i = arr.length-1; i >=0; i--) {

            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                int index = st.pop();
                next[index]=i;

            }
            st.push(i);
        }
        return next;
    }
}