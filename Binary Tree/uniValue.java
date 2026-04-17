import java.util.ArrayList;

public class uniValue {

    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean oneValue(Node root, int k) {
        if (root == null) {
            return true;
        }

        if (root.data != k) {
            return false;
        }

        if (!oneValue(root.left, k))
            return false;
        if (!oneValue(root.right, k))
            return false;

        return true;
    }

    public static boolean nivalue(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return true;
        }
        if (list == null) {
            list = new ArrayList<>();
        }

        if (list.contains(root.data)) {
            return false;
        } else {
            list.add(root.data);
        }

        if (!nivalue(root.left, list))
            return false;
        if (!nivalue(root.right, list))
            return false;

        return true;
    }

    public static void main(String[] args) {

        Node r = new Node(2);
        r.right = new Node(2);
        r.left = new Node(2);
        r.right.right = new Node(2);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.right = new Node(11);
        root.right.left = new Node(9);
        boolean b = nivalue(root, null);

        if (b)
            System.out.println("This tree has no duplicate tree");
        else
            System.out.println("This tree has  duplicate tree");

        boolean c = oneValue(r, 2);
        if (c)
            System.out.println("This tree is univalued ");
        else
            System.out.println("This tree is not univalued tree");

    }

}
