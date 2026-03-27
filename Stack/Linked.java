public class Linked {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }

    }
    public static Node top=null;
    

    public void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top= newNode;
            newNode.next= null;
        } else{
            newNode.next=top;
            top=newNode;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Your stack is empty");
            
        } else {
            top= top.next;
        }
    }

    public void display(){
        if(top==null){
            System.out.println("Stack empty!!!");
        } else {
            while(top!=null){
                System.out.println(top.data);
                top= top.next;
            }
        }
    }
    public static void main(String[] args) {
        Linked s= new Linked();
        s.push(4);
        s.push(67);
        s.push(6);
        s.push(7);

        s.pop();
        s.pop();
        s.display();
    }
}
