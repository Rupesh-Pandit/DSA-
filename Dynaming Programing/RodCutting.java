public class RodCutting {
    public static void main(String[] args) {
        int prices[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        
        int rodlen[] ={1,2,3,4,5,6,7,8}; 
        int rodLength = rodlen.length;
        int dp[][] = new int[prices.length + 1][rodLength + 1];

        // initilize
        for (int i = 0; i < rodLength + 1; i++)
            dp[i][0] = 0;
        for (int i = 0; i < prices.length + 1; i++)
            dp[0][i] = 0;

        for (int i = 1; i < prices.length + 1; i++) {// rod prices
            for (int j = 1; j < rodLength + 1; j++) {
                if (rodlen[i-1]<=j) { // valid case
                    dp[i][j] = Math.max(prices[i-1] + dp[i][ j - rodlen[i-1]], dp[i - 1][j]);
                } else { // invalid case
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
System.out.println(dp[prices.length][rodLength]);
    }
}
