package Week_2.Day_4;

import java.util.*;

class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n-1,n,list,"(");
        return list;
        
    }
    public void generate(int n ,int m, List<String> list,String s) {
        if(n==0 && m==0) {
            list.add(s);
            return;
        }
        if(n>0) {
            generate(n-1,m,list,s+"(");
        }
        if(m>0 && m>n) {
            generate(n,m-1,list,s+")");
        }

    }
}