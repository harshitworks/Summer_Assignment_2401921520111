package Week_2.Day_1;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] f1 = new int[26];
        for(char c : magazine.toCharArray()) {
            f1[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            f1[c-'a']--;
            if(f1[c-'a']<0) return false;
        }
        return true;
    }
}
