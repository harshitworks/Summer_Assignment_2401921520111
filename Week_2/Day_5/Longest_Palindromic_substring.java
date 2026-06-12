package Week_2.Day_5;

public class Longest_Palindromic_substring {
    public String longestPalindrome(String s) {
        int start = 0 ;
        int end = 0 ;
        for(int i = 0 ; i< s.length(); i++) {
            int a = expand(i,i,s);
            int b = expand(i,i+1,s);

            int len = Math.max(a, b);

            if(len > end - start) {
                start = i - (len-1)/2;
                end = i + (len)/2;
            }
        }
        return s.substring(start,end+1);

    }

    public int expand(int left , int right, String s) {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
