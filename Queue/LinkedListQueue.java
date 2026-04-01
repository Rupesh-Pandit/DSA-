
public class LinkedListQueue {
    public static class queue {
        int data;
        queue next;

        queue(int info) {
            this.data = info;
            this.next = null;
        }
    }

    public static queue front = null;
    public static queue rear = null;

    public static void enqueu(int data) {
        queue newNode = new queue(data);
        if (rear == null) {
            rear = newNode;
            front = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public static void dequeue() {
        if (rear == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (rear == front) {
            rear = null;
            front = null;
            return;
        }
        front = front.next;
    }

    public static void display() {
        if (rear == null) {
            System.out.println("Queue is underFlow");
            return;
        }

        queue temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    public static void main(String[] args) {

        enqueu(41);
        enqueu(42);
        enqueu(43);
        enqueu(44);

        dequeue();
        dequeue();
        dequeue();
        dequeue();

        dequeue();
        display();
    }
}
