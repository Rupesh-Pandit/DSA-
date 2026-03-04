public class SubArraySum {
    public static void main(String[] args) {
        int max =Integer.MIN_VALUE;
        int sum =0;
        int[] arr ={2,3,4,12,64};
        int [] prefix =new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            prefix[i] = prefix[i-1] +arr[i] ;
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i;j<arr.length; j++){
                sum =0;
                int end =j;
               sum =start == 0 ? prefix[end] :prefix[end] - prefix[start-1];
               System.out.println("The sum of subArray is " + sum);
               if(sum>max) max =sum;

            }
        }
        System.out.println("The Maximum subArray of sum is " + max);
    }
}
