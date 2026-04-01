import java.util.Deque;
import java.util.LinkedList;

public class stackUsingDeque {
    static class Stack{
        Deque<Integer> q= new LinkedList<>();

        public void push(int data){
            q.addLast(data);
        }

        public int pop(){
           return q.removeLast();
        }

        public int peek(){
            return q.getLast();
        }
    }
    public static void main(String[] args) {
       Stack s= new Stack();
       s.push(1);
       s.push(12);
       s.push(13);

       System.out.println(s.peek());

       System.out.println();
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());

    }
}
