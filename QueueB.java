import java.util.*;
import java.util.LinkedList;
public class QueueB {

     
    public static void main(String args[]){
        // QueueB q = new Queue();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        


    }
    
}
