public class unBoundedknapsack {

    public static int unBounded(int val[], int wt[], int w){
        int n= wt.length;
        int dp[][] = new int[n+1][w+1];

        for(int i=0; i< w+1; i++) dp[0][i] = 0;

        for(int j=0; j<n+1; j++) dp[j][0] = 0;

        for(int i=1; i< n + 1; i++){
            for(int j=1; j<w+1; j++){
                if(wt[i-1]<=j){ // valid case
                   dp[i][j]= Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                } else{ // exlude case 
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
       int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

       System.out.println(unBounded(val, wt, W));
    }
}
