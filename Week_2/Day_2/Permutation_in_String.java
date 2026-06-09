package Week_2.Day_2;

import java.util.Arrays;

public class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        int[] fr = new int[26];
        int[] win = new int[26];
        for(char c: s1.toCharArray()) {
            fr[c-'a']++;
        }
        int right = s1.length();
        for(int i = 0 ; i< right && i <s2.length() ; i++) {
            char c = s2.charAt(i);
            win[c-'a']++;
        }
        if(Arrays.equals(fr, win)) return true;

        int left = 0 ;
        for(int i = right; i < s2.length() ; i++) {
            char prev = s2.charAt(left++);
            char curr = s2.charAt(i);
            win[prev-'a']--;
            win[curr-'a']++;

            if(Arrays.equals(fr, win)) return true;


        }
        return false;

    }
}
