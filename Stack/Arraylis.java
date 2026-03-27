import java.util.ArrayList;
public class Arraylis{
     static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){

            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek the top of element
        public static int peek(){
            if(isEmpty()){

                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String [] args){
       
       Stack.push(3);
       Stack.push(6);
       Stack.push(4);
       Stack.push(4);
       Stack.push(4);
       Stack.pop();

       while(!Stack.isEmpty()){
        System.out.println(Stack.peek());
        Stack.pop();

       }


    }
}