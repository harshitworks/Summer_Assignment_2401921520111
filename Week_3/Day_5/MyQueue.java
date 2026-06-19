package Week_3.Day_5;
import java.util.*;

class MyQueue {
    // we are doing lazy operation here , shift only when required
    Stack<Integer> input ;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
        
    }
    
    public void push(int x) {
        input.push(x); 
    }
    
    public int pop() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.isEmpty()? -1 : output.pop();   
    }
    
    public int peek() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.isEmpty()? -1 : output.peek();
        
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty() ;
        
    }
}
