
public class LInkedListMergeSort {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

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

    void display() {
        if (head == null) {

            System.out.println("Node is empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                temp.next = head2;
                head2 = head2.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
            }
            temp = temp.next;

        }

        while (head1 != null) {
            temp.next= head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = findMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        // right and left half
        Node leftNode = mergeSort(head);
        Node rightNode = mergeSort(rightHead);

        // merge the right and left half
        return merge(leftNode, rightNode);
    }


    void zigZag(){
        // find mid
        Node mid= findMid(head);

        // reverse the right half
        Node cur= mid.next;
        mid.next= null;

        Node prev=null;
        Node next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev= cur;
            cur= next;
        }
        // join in alternate
        Node right=prev;
        Node left= head;

        Node leftNode;
        Node rightNode;

        while(right!=null && left!=null){
            leftNode= left.next;
            rightNode = right.next;

            left.next= right;
            right.next = leftNode;

            right=rightNode;
            left= leftNode;
        }
        return;

    }
    public static void main(String[] args) {
        LInkedListMergeSort ll = new LInkedListMergeSort();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(55);
        ll.addFirst(0);
        ll.addFirst(23);
        ll.addFirst(10);
        ll.display();

        System.out.println("After sorting the form merge sort in Linked list:-");
        head = ll.mergeSort(head);
        ll.display();

        ll.zigZag();
        System.out.println("After ZigZag element is");
        ll.display();

    }
}
