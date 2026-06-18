package Week_3.Day_4;

class Evaluate_Expression {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int[] stack = new int[n];
        int tos = - 1;
        for(int i = 0; i< n ; i++) {
            String s = tokens[i];

           if(!s.equals("+") &&
              !s.equals("-") &&
              !s.equals("*") &&
              !s.equals("/") ) {
                int num = Integer.parseInt(s);
                stack[++tos]=num;
            }
            else { 
                int b = stack[tos--];
                int a = stack[tos--];
                switch(s) {
                    case "+":
                        stack[++tos]=a+b;
                        break;
                    case "-":
                        stack[++tos]=a-b;
                        break;
                    case "*":
                       stack[++tos]=a*b;
                        break;
                    case "/":
                        stack[++tos]=a/b;
                        break;
                }
            }
        }
        return stack[tos];    
    }
   
}