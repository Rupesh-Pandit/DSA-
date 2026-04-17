public class validBST {
    public static class Node {
    Node right, left;
    int data;
    Node(int data){
        this.data = data;
    }
        
    }

     public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data < val) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }
        return root;

    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);

      
    }
    public static boolean ValBST(Node root, int min, int max){
        if(root == null){
          return true;
        }

       if(root.data <= min && root.data >= max){
        return false;
       }

       return ValBST(root.left, min, root.data) && ValBST(root.right, root.data, max);
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 3, 5, 7, 8 };

         Node root = null;

        for (int i = 0; i < arr.length; i++) {

            root = insert(root, arr[i]);
        }
          System.out.println();
        inOrder(root);

        boolean b= ValBST(root, 0, 0);
        if(b)
            System.out.println("This is valid BST");
        else
            System.out.println("This is not valid BST");
    }
}
