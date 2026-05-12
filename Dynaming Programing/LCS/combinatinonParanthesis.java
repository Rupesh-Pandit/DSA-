public class combinatinonParanthesis {

    public static void rec(int n, char[] str, int pos, int close, int open) {

        if (close == n &&  open ==n) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else {
            if (open > close) {
                str[pos] = '}';
                rec(n, str, pos + 1, close + 1, open);
            }
            if (open < n) {
                str[pos] = '{';

                rec(n, str, pos + 1, close, open + 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 1;
        char[] str = new char[n * 2];

        if (n > 0)
            rec(n, str, 0, 0, 0);
    }
}