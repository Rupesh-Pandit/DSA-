import merg2BST.Node;

public class findCloestElement {
    int ans = -1;
    int diff = Integer.MAX_VALUE;

    public static void cloest(Node root, int target){
        if(root == null ){
            return ;
        } 

        while(root!= null){
            int currdirr = Math.abs(root.val - target);

            if(currdirr < diff){
                ans = root.val;
                diff = currdirr;
            }
            if(root.val < target){
                cloest(root.right, target);
            } else {
                cloest(root.left, target);
            }
        }
        


    }
    public static void main(String []args){
        colest(root,  target);
    }
}
