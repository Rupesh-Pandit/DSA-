public class fibbbonaciSeries {

   public static int f[] = new int[31];

    public static int fib(int n){
        if(n==1 || n==0) return n;

        if(f[n]!=0) return f[n];

        f[n] = fib(n-1) + fib(n-2);

        return f[n];

    }

    public static void tabulation(int n){
        int dp[] = new int[n+1];

        dp[0]= 0;
        dp[1]= 1;

        for(int i=2; i<= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
        tabulation(n);
    }
    
}
