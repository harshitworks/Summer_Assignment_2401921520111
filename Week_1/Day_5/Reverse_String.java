package Week_1.Day_5;

public class Reverse_String {
    public void reverseString(char[] s) {
        for(int i = 0; i<s.length/2; i++)   {
            char el = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=el;

        }
    }
}
