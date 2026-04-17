public class leftAndRightHeight {
    public static class Node{
       int data;
       Node left, right;
       Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
       }
    }
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
          int l = height(root.left);
         int r = height(root.right);

        int h = Math.max(l, r)  + 1;


        return h;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(7);
        // root.right.right  = new Node(8);

        int Left = height(root.left);
        int Right = height(root.right);


        System.out.println("the left height is " + Left);
        System.out.println("the right height is " + Right);

        
    }
}