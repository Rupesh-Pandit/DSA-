import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();
        int []arr= {6,8,0,1,3};
        int []greater= new int[arr.length];

        for(int i=arr.length-1;i>=0; i--){-
            //while
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
               s.pop();
            }
            //if else
                if(s.isEmpty()){
                    greater[i]=-1;

                } else {
                    greater[i]  = arr[s.peek()];
                }
            // push
            s.push(i);
            
        }
        for(int g: greater){
            System.out.println(g);
        }
    }
}
