import java.util.Arrays;

public class catalan {
    public static int catalanMemoi(int n, int dp[]) {
        if (dp[n] != -1)
            return dp[n];

        if (n == 0 || n == 1) {
            dp[n] = 1;
            return dp[n];
        }
        int ans = 0;
        for (int i = -0; i <= n - 1; i++) {
            ans += catalanMemoi(i, dp) * catalanMemoi(n - 1 - i, dp);
        }
        dp[n] = ans;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        dp[0]= 1;
        dp[1]=1;
        // Arrays.fill(dp, -1);
        // System.out.println(catalanMemoi(n, dp));

        // tabulazation
        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j <i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(dp[n]);
    }
}