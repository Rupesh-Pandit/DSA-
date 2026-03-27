public class PushAtBottomInStack {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }

    }
    public static Node top=null;
    
     void push(int data){
        Node newNode = new Node(data);

        if(top==null){
            top= newNode;
            newNode.next= null;
        } else {
            newNode.next= top;
            top= newNode;

        }
    }

     void pushAtLast(int data){
        Node newNode = new Node(data);
        if(top==null){
            top=newNode;
            newNode.next= null;
        } else {
            Node temp= top;
            while(temp.next!=null){
                temp= temp.next;

            }

            temp.next= newNode;
            newNode.next= null;
        }
    }

   static void display (){
        if(top== null){
            System.out.println("Your stack is empty");
        } else {
            Node temp= top;
            while ( temp!=null) {
                System.out.println(temp.data);
                temp= temp.next;
            }
        }
    }
    public static void main(String[] args) {
        PushAtBottomInStack s= new PushAtBottomInStack();
        s.push(5);
        s.push(56);
        s.push(57);

        s.pushAtLast(6);

        display();
    }
}
