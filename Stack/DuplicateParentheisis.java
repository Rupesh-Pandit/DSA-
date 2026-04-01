import java.util.Stack;

public class DuplicateParentheisis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c <= 127 && c >= 97) {
                s.push(c);
            } else {
                if (')' == c) {
                    int count = 0;
                    while (s.peek() != '(') {
                        s.pop();
                        count++;
                    }
                    if (count < 1)
                        return true;
                    
                        s.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        boolean b = isDuplicate(str);
        if (b)
            System.out.println("Duplicate parenthesis");
        else
            System.out.println("Not Duplicate Parenthesis");
    }
}
