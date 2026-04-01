import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> queue= new LinkedList<>();

       queue.addFirst(4);
       queue.addLast(6);
       queue.addLast(9);
       queue.addLast(8);

       System.out.println(queue);
       System.out.println("First element " + queue.getFirst());
       System.out.println("First element " + queue.getLast());
    }
}
