package heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solutions {
    
    public static void main(String args[]){
        System.out.println("heaps");

    
       // PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        //List<Integer> inputList=new ArrayList<>();
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        
        queue.add(5);
        queue.add(15);
        queue.add(6);
        queue.add(18);
        queue.add(9);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        
        

    }
}
