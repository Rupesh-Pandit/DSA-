import java.util.LinkedList;
import java.util.Queue;

public class InterleavHalves {
    public static void Halves( Queue<Integer> q){
       int n= q.size();
       Queue <Integer> q1= new LinkedList<>();

       for(int i=1; i<=n/2; i++){
             q1.add(q.remove());
       }

       for(int i=1; i<= n/2; i++) {
            q.add(q1.remove());
            q.add(q.remove());
       } 

       if(n%2!=0){
        q.add(q.remove());
       }
    }
    public static void main(String []args){

        Queue <Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        Halves(q);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove(); 
        }
    }
}
