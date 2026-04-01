import java.util.Stack;

public class AreaHistogram {

   public static int  area(int arr[]){
             int nsl[]= new int[arr.length];
             int nsr[]= new int[arr.length];
             int max=0;

             Stack <Integer> s= new Stack<>();


             // next smaller left
             for(int i=0; i<arr.length; i++){
                while(!s.isEmpty() && arr[s.peek()] >= arr[i])
                    s.pop();

                if(s.isEmpty()){
                    nsl[i]=-1;
                } else {
                    nsl[i] = s.peek();
                }
                s.push(i);
             }

             s.clear();
             
             // next smaller right
             for(int i=arr.length-1; i>=0; i--){

                while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();
                } 
                if(s.isEmpty())
                    nsr[i]= arr.length;
                else 
                    nsr[i]= s.peek();

                s.push(i);
             }


             // area = height * width= nsr[i]-nsl[i]-1;
             for(int i= 0; i<arr.length; i++){
                int height = arr[i];
                int width = nsr[i]- nsl[i]-1;
                int area = height * width; 
                max= Math.max(max, area);
             }
             return max;
    }

     public static void main(String[] args) {
        int []arr={2,6,2,3};
        int a= area(arr);
        System.out.println("Maximum reatangle in histogram is "+ a);
     }
}