import java.util.Arrays;

public class commonString {
    public static int memoi(String str1, String str2, int m, int n, int dp[][]) {
        if (n<0 || m <0)
            return 0;

        if(dp[m][n]!=-1) return dp[m][n];

        if (str1.charAt(m) == str2.charAt(n)) {
         dp[m][n] = memoi(str1, str2, m-1, n-1, dp)+1;
         return dp[m][n];

        } else {
            int ans1 = memoi(str1, str2, m-1, n, dp);
            int ans2= memoi(str1, str2, m, n-1, dp);
            dp[m][n]= Math.max(ans1, ans2);
            return dp[m][n];
        }

    }

    public static int rec(String str1, String str2, int m, int n) {
        if (n<0 || m <0)
            return 0;

       
        if (str1.charAt(m) == str2.charAt(n)) {
         return  rec(str1, str2, m-1, n-1)+1;

        } else {
            int ans1 = rec(str1, str2, m-1, n);
            int ans2= rec(str1, str2, m, n-1);
            return Math.max(ans1, ans2);
        }

    }
 
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ade";

        int dp[][] = new int[str1.length()][str2.length()];

        for(int i=0; i<dp.length; i++)
            Arrays.fill(dp[i], -1);

        
        int m = str1.length() - 1;
        int n = str2.length() - 1;

        System.out.println(rec(str1, str2, m, n));
        System.out.println(memoi(str1, str2, m, n, dp));
    }
}
