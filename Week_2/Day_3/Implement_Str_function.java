package Week_2.Day_3;

public class Implement_Str_function {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        if(m > n) return -1 ;
        for(int i = 0 ; i< n; i++) {
            int j = 0 ;
            int p = i;
            while(p < n && j <m && haystack.charAt(p)==needle.charAt(j)) {
                j++;
                p++;
            }
            if(j==m) return i;
        }
        return -1 ;

    }
}
