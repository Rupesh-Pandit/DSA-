public class RotatedArray {
   public static int  rec(int arr[], int target, int st, int end){

    int mid= st+ (end-st)/2;
    if(arr[mid]== target)
        return mid;

    if(arr[st]<=arr[mid]){
        
            if(target >arr[st] && target <arr[mid] )
                return rec(arr, target, st, mid-1);
                else
                   return  rec(arr, target, mid+1, end);
    } else {
        if(target > arr[mid] && target <= arr[end])

            return rec(arr, target, mid+1, end);
            else 
                return rec(arr, target, st, mid-1);
        
    }

    
    }
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,0,1,2,3};

      int result=  rec(arr, 4, 0, arr.length-1);
        System.out.println(result);
     }
}
