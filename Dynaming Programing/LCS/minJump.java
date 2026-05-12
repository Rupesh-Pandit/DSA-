import java.util.Arrays;

public class minJump {
    public static int rec(int arr[], int n, int i) {
        if (i >= n - 1)
            return 0;

        int min = Integer.MAX_VALUE;
        
        for (int j = 1; j <= arr[i]; j++) {
            if (j < n) {
                int next = i + j;
               int a = rec(arr, n, next);
               if(a!= Integer.MAX_VALUE){

                   min = Math.min(min, a+1);
               }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 0, 1, 4 };
        System.out.println(rec(arr, arr.length, 0));


        int dp[] =  new int[arr.length];
        int n = arr.length;
             Arrays.fill(dp, -1);
        dp[n-1] = 0;
        
        for(int i= n-2; i>=0; i--){
            int step = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j= i+1; j<= step+i && j<n; j++ ){
                if(dp[j] !=-1){
                    ans = Math.min(ans, dp[j] +1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }

        System.out.println(dp[0]);
    }
}