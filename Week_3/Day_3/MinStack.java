package Week_3.Day_3;

import java.util.Stack;

class MinStack {
    long min;
    Stack<Long> stack;

    public MinStack() {
       stack = new Stack<>(); 
            
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(val*1L);
            min = val;
        }
        else if(val>=min) {
            stack.push(val*1L);
        }
        else {
            stack.push(1L*2*val-min);
            min = val;
        }   
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            long top = stack.pop();
            if(top>=min) return;
            else {
                long oldmin= 2*min - top ;
                min = oldmin ; 
            }
        }   
    }
    
    public int top() {
        if(!stack.isEmpty()) {
        long top = stack.peek();
            if(top>=min) return (int)(top);
            else {
                return (int)(min );
                
            }
        }
        return -1 ;
    }
    
    public int getMin() {
        return (int)(min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */