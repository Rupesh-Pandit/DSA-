package BitWiseOperator;

public class AddOneToNum {
    public static int[] plusOne(int []arr){
       for(int i=arr.length-1; i>=0; i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }
        else{
            arr[i]=0;
        }
       }
       int []arr1 = new int [arr.length+1];
       arr1[0] = 1;
       return arr1;
    }
   
       
    

    public static void main(String[] args) {
       int []arr = {1,3,9};
      plusOne(arr);
      for(int i=0; i<arr.length; i++)
      System.out.println(arr[i]);

        
    }
}