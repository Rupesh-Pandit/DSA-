public class LargestNumber {
    
    public static void main(String[] args) {
        int arr[] = {2,34,7,78,1,1,0};
        int smallest =arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element " + smallest);
    }
}
