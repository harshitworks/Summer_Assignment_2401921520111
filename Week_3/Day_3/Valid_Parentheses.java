package Week_3.Day_3;

class Valid_Parentheses {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int tos = -1 ;
        for(int i = 0 ; i < s.length(); i ++ ) {
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') {
                tos ++ ;
                stack[tos]=ch;
            }
            else {
                  if (tos == -1) return false;
                  if(ch==')' && stack[tos]!='(') return false ;
                  if(ch==']' && stack[tos]!='[') return false ;
                  if(ch=='}' && stack[tos]!='{') return false ;

                  tos--;

            }
            

        } 
        return tos==-1; 
    }
}