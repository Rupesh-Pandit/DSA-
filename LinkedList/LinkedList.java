public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data) {
        // create the node
        Node newNode = new Node(data);

        if (head == null) {
            tail = head = newNode;
            return;
        }

        // newNode next = Node
        newNode.next = head;

        // newNode = head
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data); // creating the node

        if (head == null) { // if linked list is empty;
            head = tail = newNode;
            return;
        } else { // if more than one node in linked list;
            tail.next = newNode;
            tail = newNode;

        }

    }

    // add node at given postion
    void addPostion(int data, int pos) {
        Node newNode = new Node(data);
        Node temp, hold;

        if (head == null) {
            System.out.println("Cannot be sotred in a given position");
            return;
        }

        temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        hold = temp.next;
        temp.next = newNode;
        newNode.next = hold;

    }

    void print() {

        if (head == null) {
            System.out.print("linked list is Empty");
            return;
        }
        Node temp;
        temp = head;

        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;

        }
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("Your linked list is empty ");
            return;
        }
        head = head.next;
    }

    // delete form last
    void deleteLast() {
        Node temp;
        if (head == null) {
            System.out.println("linked list is empty");
        }

        if (head == tail) {
            head = null;
            tail = null;
        }

        temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;

    }

    void deletePosition(int pos) {

        Node temp, hold;
        temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        hold = temp.next;
        temp.next = hold.next;
    }

    public static int iteratorSearch(int key) {
        Node temp;
        int idx = 0;
        temp = head;
        while (temp != null) {
            idx++;
            if (temp.data == key)
                return idx;
            temp = temp.next;
        }
        return -1;
    }

    int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;

    }

    int recSearch(int key) {
        return helper(head, key);
    }

    void revLinkedList() {
        Node cur = tail = head;
        Node prev = null;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;

    }

    void deleteFormNthEnd(int n) {
        int size = 0;
        Node temp = head, hold;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }
        temp = head;
        for (int i = 1; i < (size - n + 1) - 1; i++) {
            temp = temp.next;
        }
        hold = temp.next;
        temp.next = hold.next;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean findPalindrom() {

        // find the mid value;
        Node mid = findMid(head);

        // reverse the half of the linked list
        Node cur = mid;
        Node prev = null;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        Node left = head;
        Node right = prev;

        // check the second half to first half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(1);
        ll.addLast(1);
        ll.print();
        boolean b= ll.findPalindrom();
        if(b){
            System.out.println("This linked list is palindrom ");
        } else{
            System.out.println("This linked list is not palindorm");
        }

    }
}