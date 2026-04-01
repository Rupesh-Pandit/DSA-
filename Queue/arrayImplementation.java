public class arrayImplementation {
    public static class  queue {
       static int arr[];
       static int size;
       static int rear;
       static int front;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front= 0;
        }
        public boolean isEmpty(){
            return front >rear;
        }

        public void add(int data){
            if(rear==size-1){
                System.out.println("Your queue is full");
                return;
            }
            rear++;
            arr[rear]= data;
        }

        public void delete(){
               if(front>rear){
                System.out.println("Your queue is empty");
                return;
               }

               front++;
        }

        public  void display(){
              if(front>rear) System.out.println("queue is underflow");

              else
              {
                for(int i= front; i<= rear; i++ ){
                    System.out.println(arr[i]);
                }
              }
        }
    }
    public static void main(String[] args) {
        queue  q= new queue(4);
        
        q.add(1);
        q.add(11);
        q.add(111);

        q.display();

        System.out.println();
        q.delete();
        q.display();
    }

}