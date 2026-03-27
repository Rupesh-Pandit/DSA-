import java.util.Stack;

public class PushAtBottoom {
    public static void pushAtLast(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtLast(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(7);
        s.push(8);

        pushAtLast(s, 5);

        while (!s.isEmpty()) {
            System.out.println(s.get(s.size() - 1));
            s.pop();
        }
    }
}
