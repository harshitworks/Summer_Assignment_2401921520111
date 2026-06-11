package Week_2.Day_4;
import java.util.*;

class Decode_String {
    public String decodeString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>(); 
        StringBuilder word = new StringBuilder();
        for(int i = 0 ; i< n; i++) {
            char c = s.charAt(i);
             
            if(c!=']') {
                stack.push(c);
            }
            else {
                word.setLength(0);
                while(!stack.isEmpty() && Character.isAlphabetic(stack.peek())) {
                    char ch = stack.pop();
                    word.append(ch);
                }
                stack.pop(); // discarding '['
                String nm = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    String temp =  stack.pop()+"";
                    nm = temp+nm;
                
                }
                int num = Integer.parseInt(nm) ;
                word = word.reverse();
                String part = word.toString();
                while(num-->1) {
                    word.append(part);
                }
                for(char p : word.toString().toCharArray()){
                    stack.push(p);
                }
                
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();    
    }
}