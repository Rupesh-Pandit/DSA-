public class quickSort {
    public static int partition(int arr[], int st, int end){
        int pivot= arr[end];

        int i=st-1;
       for(int j=st; j<end; j++) {
            if(arr[j]<pivot ){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                
            }
            
        }
        i++;
       int a= arr[i];
       arr[i]=pivot;
       arr[end]= a;
return i;
    }

    public static void quick(int arr[], int st, int end){
        if(st<end){
            int pivot= partition(arr, st, end);
            quick(arr, st, pivot-1);// left array
            quick(arr, pivot+1, end);// Right array
        }
    }
    public static void main(String[] args) {
        int [] arr= {15,1,3,5,6};
quick(arr, 0, arr.length-1);

for(int a:arr){
    System.out.println(a);
}

    }
}