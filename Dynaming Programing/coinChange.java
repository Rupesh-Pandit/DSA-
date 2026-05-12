public class coinChange {

    public static void totalWasys(int coins[], int dp[][], int sum) {

        // i means coins 
        // j means sum 
        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) { // include
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else { // exclulde code
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("The table= ");
        print(dp);
        System.out.println(dp[coins.length][sum]);
    }

    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 3 };
        int sum = 4;

        int dp[][] = new int[coins.length + 1][sum + 1];

        for (int i = 0; i < coins.length + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < sum + 1; i++) {
            dp[0][i] = 0;
        }

        totalWasys(coins, dp, sum);
    }
}