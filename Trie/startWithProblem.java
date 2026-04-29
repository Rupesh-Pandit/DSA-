public class startWithProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow= false;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i]= null;
            }

        }
    }
    public static Node root = new Node();

    public static void insert(String key){
        Node curr = root;

        for(int i=0; i< key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] ==null)
                curr.children[idx] = new Node();

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean findPrefix(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) -'a';
             if(curr.children[idx] ==null) return false;

             curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]= {"apple",  "app", "song", "moon", "mango", "rupesh"};


        for(int i=0; i<words.length; i++)
            insert(words[i]);

        System.out.println(findPrefix("ra"));

    }
}
