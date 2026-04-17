import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityQueue{
    public static void main(String []args){
        // for descending order Comparator.reverseOrder() use it.

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4); // O(logn)
        pq.add(5);
        pq.add(7);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  // O(1)
            pq.remove();  // O(logn)
        }

    }
}