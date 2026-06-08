package Week_2.Day_1;
import java.util.*;

public class Unique_Character {
    public int firstUniqChar(String s) {
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> visited = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) set.remove(c);
            else if(!visited.contains(c)) set.add(c); visited.add(c);
        }
        if(!set.isEmpty()) {
            Character first = set.iterator().next();
            return s.indexOf(first);
        }
        return -1;
    }
}
