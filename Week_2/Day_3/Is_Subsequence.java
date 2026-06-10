package Week_2.Day_3;

class Is_Subsequence {

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        boolean[][] dp = new boolean[n+1][m+1];
        // base - case:
        for(int i = 0 ; i< n+1 ; i++) {
            dp[i][0]= false;
        }
        for(int j = 0 ; j< m+1 ; j++) {
            dp[0][j]=true;
        }
        for(int i = 1; i< n+1 ; i++) {
            for(int j = 1; j <m+1 ; j++) {
                boolean check = false;
                if(s.charAt(i-1)==t.charAt(j-1)) check = dp[i][j-1] || dp[i-1][j-1];
                else check = dp[i][j-1];
                
                dp[i][j]=check;
            }
        }
        return dp[n][m];
          
    }

}

