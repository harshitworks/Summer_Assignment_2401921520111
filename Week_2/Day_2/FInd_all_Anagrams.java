package Week_2.Day_2;

import java.util.*;

public class FInd_all_Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] need = new int[26];
        int[] win = new int[26];
        for(char c: p.toCharArray()) {
            need[c-'a']++;
        }
        int right = p.length();
        for(int i = 0 ; i< right && i <s.length() ; i++) {
            char c = s.charAt(i);
            win[c-'a']++;
        }
        if(Arrays.equals(need, win)) list.add(0);

        int left = 0 ;
        for(int i = right; i < s.length() ; i++) {
            char prev = s.charAt(left++);
            char curr = s.charAt(i);
            win[prev-'a']--;
            win[curr-'a']++;

            if(Arrays.equals(need, win)) list.add(left);
        }
        return list;

    }
}
