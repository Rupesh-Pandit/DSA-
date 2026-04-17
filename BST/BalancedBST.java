import java.util.LinkedList;
import java.util.Queue;

public class BalancedBST {
    static class Node {
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
        
    }
    public static Node createBST(int arr[],  int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st + end)/2;
         Node root = new Node(arr[mid]);
         root.left = createBST(arr, st, mid-1);
         root.right = createBST(arr, mid+ 1, end);
  return root;

    }

    public static void print(Node root){
        if(root == null){
            return ;
        }

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);


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

public static void main(String []aStrings){

    int []arr = {3,5, 6, 8, 10, 18, 19 , 20};
    Node root = createBST(arr, 0, arr.length-1);
   print(root);
   System.out.println();
   level(root);

}
}
