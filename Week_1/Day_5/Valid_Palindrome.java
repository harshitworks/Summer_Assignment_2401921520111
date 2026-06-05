package Week_1.Day_5;

public class Valid_Palindrome {
    public static  boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length();
        for(int i = 0 ; i < n/2 ; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

}
