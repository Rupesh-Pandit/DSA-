public class TargetSumTab {

    public static boolean targetsum(int arr[], int t){
        boolean dp[][]=  new boolean[arr.length +1][t+1];

        for(int i=0;i<arr.length+1; i++) dp[i][0] =  true;
        
        for(int i=1; i<arr.length + 1; i++ ){
            for(int j=1; j<t+1; j++){
                int val= arr[i-1];
                if(val <= j && dp[i-1][j-val] ==  true ){
                    dp[i][j]= true;
                } else {
                    if(dp[i-1][j]== true ) dp[i][j] = true;
                }
            }
        }

        print(dp, arr, t);
        return dp[arr.length][t];
    }

    public static void print(boolean dp[][], int arr[], int t){
        for(int i=0; i< arr.length + 1; i++){
            for(int j=0; j< t+1; j++){
                System.out.print(dp[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,2,7 ,1,3};

        int  targetSum = 10;

        System.out.println(targetsum(arr, targetSum));
    }
}
