public class circular {
    public static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = n-1;
            front = n-1;

        }
        public boolean isFull(){
            return front == (rear+1)%size;
        }

        public boolean isEmpty(){
            return rear == front;
        }

        public void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is underflow");
                return;
            }

            rear= (rear+1)%size;
            arr[rear]= data;
        }

        public void dequeue(){
            if(isEmpty()){
                System.out.println("Queue is alreadly empty");
                return;
            }

            front = (front+1)%size;
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            } 

            for(int i= (front+1)%size; i!= (rear+1)%size; i= (i+ 1)%size){
                System.out.println(arr[i]);
            }

          
        }
    }

    public static void main(String[] args) {
        queue q= new queue(4);

        q.enqueue(1);
        q.enqueue(22);
        q.enqueue(333);

        q.display();
        q.dequeue();

        q.display();
        q.enqueue(7);
        q.display();

    }
}
