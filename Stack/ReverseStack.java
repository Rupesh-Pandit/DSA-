import java.util.Stack;

public class ReverseStack {

    public static void pushAtLast(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtLast(s, data);
        s.push(top);
    }



    public static void rev(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        rev(s);
        pushAtLast(s, top );

    }

    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();

        s.add(6);
        s.add(7);
        s.add(8);

        rev(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
