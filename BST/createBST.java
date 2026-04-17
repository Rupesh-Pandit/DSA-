import java.util.ArrayList;

public class createBST {
    static class Node {
        Node right, left;
        int data;

        Node(int data) {
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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static int search(Node root, int key) { // TC O(n)
        if (root == null) {
            return -1;
        }
        if (root.data == key) {
            return 1;
        }

        if (root.data < key) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }

    }

    public static Node inSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int k) {
        if (root.data < k) {
            root.right = delete(root.right, k);
        } else if (root.data > k) {
            root.left = delete(root.left, k);

        } else {
            if (root.left == null && root.right == null) { // leave node
                return null;
            }
            if (root.left == null) {// single node
                return root.right;
            }
            if (root.right == null) { // single node
                return root.left;
            } else { // both right and left node
                Node IS = inSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static void printInRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.data >= low && root.data <= high) {
            printInRange(root.left, low, high);
            System.out.print(root.data + " ");
            printInRange(root.right, low, high);
        } else if (root.data < low) {
            printInRange(root.right, low, high);
        } else {
            printInRange(root.left, low, high);
        }
    }

    public static void print(ArrayList <Integer> arr){

        for(int i=0; i< arr.size(); i++){
            System.out.print(arr.get(i) +"->");
        }
        System.out.println();
    }

    public static void leaf2Path(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            print(list);
        }

        leaf2Path(root.left, list);
        leaf2Path(root.right, list);
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 3, 5, 7, 8 };

        Node root = null;

        for (int i = 0; i < arr.length; i++) {

            root = insert(root, arr[i]);
        }

        inOrder(root);

        int k = 3;
        int a = search(root, k);
        System.out.println();
        if (a == -1)
            System.out.println("The key not found");
        else
            System.out.println("The key found");

        Node r = delete(root, 7);
        inOrder(r);
        System.out.println();
        System.out.println("The value is printed in range between 3 and 8");
        printInRange(root, 3, 8);

        ArrayList<Integer> ab = new ArrayList<>();
        System.out.println();
        leaf2Path(root, ab);
    }

}