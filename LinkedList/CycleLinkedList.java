public class CycleLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public boolean isCycle() {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    void deleteCycle() {
        Node slow = head;
        Node fast = head;

        boolean cycleFound = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }

        if (!cycleFound)
            return;

        // Step 2: Find start of cycle
        slow = head;
        if(slow==fast){
            while(fast.next!=slow){
                fast= fast.next;
            }
            fast.next = null;
            return;
        }
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        CycleLinkedList ll = new CycleLinkedList();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(5);
        ll.head.next.next.next = ll.head;

        // ll.print();
        boolean b = ll.isCycle();
        if (b)
            System.out.println("this linked list is cycle ");
        else
            System.out.println("This linked list is not cycle");

        ll.deleteCycle();
        ll.print();
    }

}
