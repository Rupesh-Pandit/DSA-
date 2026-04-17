

public class largestBst {
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   public static class  info{
        int size; 
        int min;
        int max;
        boolean isBST;
        info(int size, int min, int max, boolean isBST){
            this.isBST= isBST;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }
static int maxBST =0;
    public static info validBST(Node root){

        if(root == null){
            return new info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        info leftInfo = validBST(root.left); 
        info rightInfo = validBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(rightInfo.min, leftInfo.min));
        int max = Math.max(root.data, Math.max(rightInfo.max, leftInfo.max));


        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new info(size, min, max, false);
        }

        if(leftInfo.isBST && rightInfo.isBST){
          maxBST = Math.max(size, maxBST);
            return new info(size, min, max, true);
        }

        return new info(size, min, max, false);
    }

    public static void main(String [] args){
         Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        validBST(root);

        System.out.println("The maxmimum size of BST is "+ maxBST);
    }
}
