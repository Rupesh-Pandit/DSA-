public class subArray {
    public static void main(String[] args) {
        int max =Integer.MIN_VALUE;
       int [] arr= {2,4,3,5,7};
       for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            int sum=0;
            for(int k=i; k<=j; k++){
                sum =sum +arr[k];
                System.out.print(arr[k]+ " ");
            }
            if(sum>max) max =sum;
            System.out.println();
        }
        System.out.println();
       }
       System.out.println("tha max of subarray is "+max);
    }
}
