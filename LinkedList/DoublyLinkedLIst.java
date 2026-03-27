public class DoublyLinkedLIst {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            tail = newNode;
            head = newNode;
           
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
     
        }
    }


    void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            tail = head = newNode;
        }
        else {
            tail.next= newNode;
            newNode.prev= tail;
            tail = newNode;
        }
    }

    void removeFirst(){
        if(head==null){
            System.out.println("Your linked list is empty");
            return;
        }
             head= head.next;
             head.prev= null;
             size--;
    }
    void display(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverse(){
        Node prev= null; 
        Node cur= head;
        Node next;

        while(cur!= null){
            next= cur.next;
            cur.next = prev;
            cur.prev = next;

          prev = cur;
          cur= next;
        }
        head = prev;
    }
    public static void main(String[] args) {

        DoublyLinkedLIst dll = new DoublyLinkedLIst();
        dll.addFirst(23);
        dll.addFirst(23);
        dll.addFirst(23);

        dll.display();
        dll.removeFirst();
        System.out.println("After deleting form first");
        dll.display();
        dll.addLast(56);

        dll.display();

        dll.reverse();
        System.out.println("Total size of doubbly linked list is " + size);
        dll.display();
    }
}
