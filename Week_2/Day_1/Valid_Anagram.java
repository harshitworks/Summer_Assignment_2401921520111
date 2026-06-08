package Week_2.Day_1;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] fre = new int[26];   // creates an array of length 26 , initially all the elements '0'.

        for(int i = 0 ; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            fre[ch-'a']++;     // here ch-'a' refers to a index from 0 to 25 each for a alphabet.

        }
        for(int i = 0 ; i < t.length(); i++ ) {
            char ch = t.charAt(i);
            fre[ch-'a']--;
            if(fre[ch-'a']<0) return false;

        }

        return true;
    }
}
