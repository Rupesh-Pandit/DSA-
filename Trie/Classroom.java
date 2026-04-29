public class Classroom {
    static class Node {
        Node children[] = new Node[26];
        public boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i =0; i< word.length(); i++){
           int idx = word.charAt(i) - 'a';
           if(curr.children[idx] == null){
            curr.children[idx] = new Node();
           } 
           curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String word){
        Node curr = root;

        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx] == null)
                return false;
            curr = curr.children[idx];

        }
       return curr.eow;
    }

    public static boolean wordBreak(String word){
        if(word.length() ==0) return true;

        for(int i =1; i<= word.length(); i++){
            if(search(word.substring(0, i)) && wordBreak(word.substring(i))) 
                return true;
        }
        return false;
    }
    public static void main(String[] ars) {

        String words[] = {"the", "a", "there", "any", "thee", "their"};

        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }

        boolean b = search("th");
        if(b)
            System.out.println("the world exist");
        else 
            System.out.println("The world doesn't exist");

        System.out.println(wordBreak("thea"));

    }
}