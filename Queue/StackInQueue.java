import java.util.*;

public class StackInQueue {
    public static Stack<Integer> queue() {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        char ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data");
            int data = sc.nextInt();

            if (s1.isEmpty()) {
                s1.push(data);
            } else {
                while (!s1.isEmpty()) { // time complexity is O(n)
                    s2.push(s1.peek());
                    s1.pop();
                }
                s1.push(data);

                while (!s2.isEmpty()) { // time complexity is O(n)
                    s1.push(s2.peek());
                    s2.pop();
                }
            }

            System.out.println("Do you want to add(y/n)");
            ch = sc.next().charAt(0);

        } while (ch == 'y');

        return s1;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1 = queue();

        System.out.println("Your data in queue form");
        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
