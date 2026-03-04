public class toUpperCase {

    public static String upperCase(String st) {
        StringBuilder sb = new StringBuilder("");
        char ch= Character.toUpperCase(st.charAt(0));
        sb.append(ch);
            for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i - 1) == ' ') {
                char c= Character.toUpperCase(st.charAt(i));
                sb.append(c);
            } else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "i am rupesh pandit";
        System.out.println(upperCase(s));

    }
}
