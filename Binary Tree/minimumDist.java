public class minimumDist {

    public static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    
        
    }
    public static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        } 

        if(root.data == n1 || root.data == n2){
            return root;
        }

        if(root.left == null ){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }

      return root;
    }

    public static int dis(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n)
            return 0;

        int ldis= dis(root.left, n);
        int rdis=   dis(root.right, n);

        if(ldis == -1 && rdis ==-1){
            return -1;
        } else if(ldis == -1){
            return rdis+1;
        } else{
            return ldis + 1;
        }
    }

    public static int mindis(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);

        int dis1 = dis(lca, n1);
        int dis2 = dis(lca, n2);

        return dis1 + dis2;
    }
     public static void main (String [] args){
         /*
         * 1
         * /\
         * 2 3
         * /\ /\
         * 4 5 6 7
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        int distance = mindis(root, 4, 7);
        System.out.println("The minimum distance is " + distance);
     }
}