import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTtoBalancedBST {
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

    public static ArrayList<Integer> getArray(Node root, ArrayList<Integer> l) {

        if (root == null) {
            return l;
        }

        getArray(root.left, l);
        l.add(root.data);
        getArray(root.right, l);

        return l;
    }

    public static Node createBST(ArrayList<Integer> list, int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }

      public static void level(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else{
                    System.out.println();
                    q.add(null);
                }
            } else{
                System.out.print(curr.data + " ");
                if(curr.left!= null){
                    q.add(curr.left);

                    if(curr.right != null)
                        q.add(curr.right);
                }
            }
        }

    }

    public static void postOrder(Node r) {
        if (r == null) {
            return;
        }

        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.data + " ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        list = getArray(root, list);

        Node r = createBST(list, 0, list.size() - 1);
        level(r);

    }
}
