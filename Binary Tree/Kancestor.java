import java.util.LinkedList;
import java.util.Queue;

public class Kancestor {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void traverse(Node root) {

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

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int sumTransform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = sumTransform(root.left);
        int rightChild = sumTransform(root.right);

        int data = root.data;

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        root.data = leftData + leftChild + rightData + rightChild;
        return data;

    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n)
            return 0;

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
            return 0;
        }

        return max + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.right = new Node(8);
        root.right.left = new Node(9);

        kAncestor(root, 7, 2);

        sumTransform(root);
        System.out.println("After sum transform of the tree  =");
        traverse(root);

    }
}