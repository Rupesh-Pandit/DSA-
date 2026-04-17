import java.util.ArrayList;

public class largestBSTinBT {
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

    public static void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

        return;

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int sum = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = list.get(i);
            if (temp < list.get(i + 1)) {
                sum++;
            } else {
                sum = 1;
            }
        }

        System.out.println("The maximum size of BST in BS " + sum);
    }

}
