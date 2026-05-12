public class matrixChainMul{


    public static int rec(int arr[], int i, int j){
        if(i== j) return 0;

        int ans =Integer.MAX_VALUE;

        for(int k=i; k<j; k++){
            int cost1 = rec(arr, i, k); // arr[i-1] * arr[k]
            int cost2 = rec(arr, k+1, j); // arr[k] * arr[j];

            int cost3 = arr[i-1] * arr[k] * arr[j]; 
            int result = cost1 + cost2 + cost3;
           
            ans = Math.min(result, ans);

        }
        return ans;
    }

    public static int recMemo(int arr[], int i, int j, int dp[][]){
        if(i==j ) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j;  k++){
            int cost1 = recMemo(arr, i, k, dp);
            int cost2 = recMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
 

            int result = cost1 + cost2 + cost3;

        ans = Math.min(result, ans);
        }
        dp[i][j] =  ans;

        return dp[i][j];
    }

    public static void mcmTablu(int arr[]){

        int dp[][] = new int[arr.length][arr.length];

        for(int len =2; len< arr.length;  len++){
            for(int i=1; i<= arr.length-len ; i++){
                int j = i+len -1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k< j; k++){
                    int c1= dp[i][k];
                    int c2 = dp[k+1][j];
                    int c3 = arr[i-1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], c2+ c1+ c3);
                }
            }

        }
        System.out.println(dp[1][arr.length-1]);
    }
    public static void main(String[] args) {
        int arr []  = {1,2,3,4,3};

        mcmTablu(arr);


        int dp[][] = new int [arr.length][arr.length] ;

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr.length;j++)
        dp[i][j]= -1;
        System.out.println(recMemo(arr, 1, arr.length-1, dp));

System.out.println(rec(arr, 1, arr.length-1));
    }
}