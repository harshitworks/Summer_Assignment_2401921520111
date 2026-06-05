package Week_1.Day_5;

public class Longest_Common_Prefix {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==1) return  strs[0];
            String smallest = strs[0];
            for(int i = 0 ; i < strs.length; i++) {
                if(smallest.length()>strs[i].length())  smallest = strs[i];
            }

            int count = 0 ;
            for(int j = 0 ; j < smallest.length(); j++) {
                for(int i = 0 ; i < strs.length; i++) {
                    String curr = strs[i];
                    if(curr.charAt(j) == smallest.charAt(j)){
                        if(i==strs.length-1) count++ ;
                    }
                    else return smallest.substring(0,count);

                }
            }
            return smallest.substring(0,count);
        }

}
