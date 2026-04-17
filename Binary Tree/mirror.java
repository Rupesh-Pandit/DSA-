import java.util.LinkedList;
import java.util.Queue;

public class mirror {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node Mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftChild = Mirror(root.left);
        Node rightChild = Mirror(root.right);

        root.left = rightChild;
        root.right = leftChild;

        return root;

    }

    public static void levelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.right != null) {
                    q.add(curr.right);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.right = new Node(11);
        root.right.left = new Node(9);

        System.out.println("Before the mirror ");
        levelOrder(root);
        Mirror(root);
        System.out.println("After the mirror ");
        levelOrder(root);
    }
}