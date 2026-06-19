package Week_3.Day_5;
import java.util.*;

class RecentCounter {
    int request ;
    Queue<Integer> q ;

    public RecentCounter() {
        request = 0 ;
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        while(!q.isEmpty() && t-q.peek()> 3000) {
            q.poll();
            request--;   
        }
        request+= 1;
        q.add(t);
        return request;
    }
}

