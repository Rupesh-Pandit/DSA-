import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatin {
    public static void nonRepeat(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            q.add(c); // add in queue
            freq[c - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) { // check the condition of empty queue and freq>1 form the
                                                               // front end of queue
                q.remove();
            }

            if (!q.isEmpty()) {
                // first from rear is 1 then print first non repeatin char
                System.out.println(q.peek());
            } else {
                System.out.println(-1); // not found in non repeatin char
            }
        }
    }

    public static void main(String[] args) {

        String str = "aabccxb";
        nonRepeat(str);
    }
}
