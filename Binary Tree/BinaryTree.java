import java.util.*;

public class BinaryTree {

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class Binary {
        static int idx = -1;

        public  Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public  void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public  void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public  void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public  void LevelOrder(Node root) { // Breath First Search Tree.
            if (root == null)
                return;

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                }
            }

        }

        public int height(Node root) {

            int totalHeight = 0;

            if (root == null)
                return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            totalHeight = Math.max(lh, rh) + 1;

            return totalHeight;

        }

        public int count(Node root) {
            if (root == null)
                return 0;

            int l = count(root.left);
            int r = count(root.right);
            int c = l + r + 1;

            return c;
        }

        public  int sum(Node root){
            if(root== null)
                return 0;

           int  l= sum(root.left);
           int r=  sum(root.right);
           int totalSum= l+ r+ root.data;

           return totalSum;
        }

        public int diameter(Node root){ // Time complexity is O(n2)
              if(root == null) 
                return 0;

             int  ld= diameter(root.left);
             int  rd = diameter(root.right);
             int lh= height(root.left);
             int rh = height(root.right);
             return Math.max(ld, Math.max(rd, (lh+ rh+ 1)));
        }
       

        public  info diameter1(Node root){// Time complexity is O(n)
            if(root == null)
                return new info(0, 0);

           info leftInfo= diameter1(root.left);
           info  rightInfo= diameter1(root.right);

           int d= Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
           int h= Math.max(leftInfo.ht, rightInfo.ht) + 1;

           return new info(d, h);

        }

    }
     static class info{
        int diam;
        int ht;

        info(int diam, int ht){
            this.diam= diam;
            this.ht= ht;
        }
    }

    
    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binary tree = new Binary();
        Node root = tree.BuildTree(nodes);

        tree.preOrder(root);
        System.out.println();

        tree.inOrder(root);
        System.out.println();

        tree.postOrder(root);

        System.out.println("level oreder");

        tree.LevelOrder(root);

        int h = tree.height(root);
        System.out.println(h);

        System.out.println("Total nodes in a tree " + tree.count(root));


        System.out.println("Total sum of Nodes are " + tree.sum(root));

        System.out.println("The diameter of the tree is " + tree.diameter(root));

        System.out.println("the diameter and height of tree is "+ tree.diameter1(root).diam +" " + tree.diameter1(root).ht );
    }
}