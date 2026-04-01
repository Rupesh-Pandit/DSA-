import java.util.Deque;
import java.util.LinkedList;

public class queueInDeque {

    static class queue{
        Deque <Integer> q= new LinkedList<>();

        public void Enequeue(int data){
            q.addLast(data);
        }

        public int Deqeueue(){
            return q.removeFirst();
        }

        public int peek(){
            return q.removeFirst();
        }
    }
    public static void main(String[] args) {
        queue q= new queue();
        q.Enequeue(3);
        q.Enequeue(4);
        q.Enequeue(5);
        q.Enequeue(7);

        System.out.println(q.Deqeueue());

        System.out.println(q.peek());
    }
}