import java.util.Stack;

public class ValidParentheisis {
    public static boolean parenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (s.isEmpty())
                        return false;

                if (str.charAt(i) == ']') {
                    
                    if ('[' == s.peek())
                        s.pop();
                    else
                        return false;
                }
                if (str.charAt(i) == '}') {
                    
                    if ('{' == s.peek())
                        s.pop();
                    else
                        return false;
                }
                if (str.charAt(i) == ')') {
                    
                    if ('(' == s.peek())
                        s.pop();
                    else
                        return false;
                }
            }

        }
        if (s.isEmpty())
            return true;
        else return false;

    }

    public static void main(String[] args) {
        String str = "([])";
        boolean b = parenthesis(str);
        if (b)
            System.out.println("Your parenthesis is valid");
        else
            System.out.println("Not valid");
    }
}