import java.util.Arrays;

public class Knapsack {

    public static int sack(int val[], int wt[], int w, int n, int dp[][]) {
        if (n == 0 || w == 0)
            return 0;

        if (dp[n][w] != -1)
            return dp[n][w];
        if (wt[n - 1] <= w) {
            // include
            int ans1 = val[n - 1] + sack(val, wt, w - wt[n - 1], n - 1, dp);

            int ans2 = sack(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        } else {
            dp[n][w] = sack(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static int KnapsackTap(int val[], int wt[], int k) {
        int n = val.length + 1;

        int m = k + 1;
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            dp[i][0] = 0;
        for (int j = 0; j < n; j++)
            dp[0][j] = 0;

        for (int i = 1; i < n; i++) { // items 
            for (int j = 1; j < m; j++) { // capacity 
                int v = val[i - 1];
                int w = wt[i - 1];

                if (w<=j) {
                    dp[j][i] = Math.max(v + dp[j - w][i - 1] , dp[j][i - 1]);
                } else {
                    dp[j][i] = dp[j][i - 1];
                }
            }
        }

        System.out.println("The tabulation talbl is ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                System.out.print(dp[i][j] + " ");
            System.out.println();
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        System.out.println(sack(val, wt, W, val.length, dp));
        System.out.println(KnapsackTap(val, wt, W));
    }

}