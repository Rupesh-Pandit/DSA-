import java.util.Comparator;
import java.util.PriorityQueue;

public class object {
    public static class Students implements Comparable <Students>{
        int rank;
        String name;

        Students(int rank, String name){
            this.rank = rank;
            this.name = name;

        }

@Override
public int compareTo(Students s2){
    return this.rank - s2.rank;
}
    }
    public static void main(String[] args) {
        PriorityQueue<Students> pq= new PriorityQueue<>(Comparator.reverseOrder());

         pq.add( new Students(1, "Rupesh"));
         pq.add(new Students(5, "Roshan"));
         pq.add(new Students(7, "dibas"));

         while (! pq.isEmpty()) {{
            System.out.println(pq.peek().rank + "->" + pq.peek().name);
            pq.remove();
         }
            
         }
    }
}
