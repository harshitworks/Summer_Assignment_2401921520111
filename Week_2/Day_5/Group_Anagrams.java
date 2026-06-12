package Week_2.Day_5;
import java.util.*;

class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());   

        
    }
}