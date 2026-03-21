import java.util.ArrayList;
import java.util.List;

class digitToword {

    public static String wordConverter(int n, List<String> a){
        String[] str = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};

        if(n == 0){
            // join all words into a single string
            StringBuilder sb = new StringBuilder();
            for(String s : a){
                sb.append(s);
            }
            return sb.toString();
        }

        int r = n % 10;
        a.add(0, str[r]);   // add at front to maintain correct order

        return wordConverter(n / 10, a);
    }

    public static void main(String[] args) {
        int n = 123;
        List<String> list = new ArrayList<>();

        String result = wordConverter(n, list);
        System.out.println(result);
    }
}