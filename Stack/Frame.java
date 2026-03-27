import java.util.*;
 
public class Frame {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(7);

        while (!s.isEmpty()) {
            System.out.println(s.get(s.size() - 1));
            s.pop();
        }
    }
}
