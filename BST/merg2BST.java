import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class merg2BST {
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

    static ArrayList<Integer> list = new ArrayList<>();

    public static void mergbst(Node root) {
        if (root == null) {
            return;

        }

        // inorder traversal

        mergbst(root.left);
        list.add(root.data);
        mergbst(root.right);
    }

    public static Node createBST(ArrayList<Integer> list, int st, int end) {
        if (st > end)
            return null;

        int mid = (st + end) / 2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }

    public static void level(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        mergbst(root1);
        mergbst(root2);
        Collections.sort(list);

        Node root = createBST(list, 0, list.size() - 1);
        level(root);

    }
}
