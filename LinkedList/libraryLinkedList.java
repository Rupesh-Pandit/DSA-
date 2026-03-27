import java.util.LinkedList;
public class libraryLinkedList {
    public static void main(String [] args){
        // create the linked list
        LinkedList <Integer> ll= new LinkedList<>();

        // add 
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addLast(8);

        ll.removeFirst();
        System.out.println(ll);
    }
}
