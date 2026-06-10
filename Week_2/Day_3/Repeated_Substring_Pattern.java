package Week_2.Day_3;

class Repeated_Substring_Pattern {
    String s;
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        this.s= s;
        for(int j = 1 ; j <= n/2 ; j++) {
            if(match(j)) return true;
        }
       return false; 
        
    }
    public boolean match(int j){
        int n = s.length();
        if(n%j!=0) return false;

        StringBuilder sb = new StringBuilder();
        String part = s.substring(0,j);

        while(sb.length()<n) {
            sb.append(part);
        }
        return sb.toString().equals(s);
    }
}