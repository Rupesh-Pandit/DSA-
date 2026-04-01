import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueInStack {

    public static Queue<Integer> queue(){
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();

        char ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter data");
            int data = sc.nextInt();

            if(q1.isEmpty()){
                q1.add(data);
            } else {
                while (!q1.isEmpty()) {
                    q2.add(q1.peek());
                    q1.remove();
                } 

                q1.add(data);

                while (!q2.isEmpty()) {
                    q1.add(q2.peek());
                    q2.remove();
                }
            }

            System.out.println("Do you want to add (y/n)");
            ch= sc.next().charAt(0);
        }while(ch=='y');

        return q1;
    }
    public static void main(String []args){
Queue<Integer> q1= new LinkedList<>();

q1= queue();

System.out.println("queue in stack form ");
while (!q1.isEmpty()) {
    System.out.println(q1.peek());
    q1.remove();
}
    }
}