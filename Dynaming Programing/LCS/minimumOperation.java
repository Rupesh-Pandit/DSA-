public class minimumOperation{

    public static void main(String []args){
        String word1 =   "intention";
        String word2 = "execution";

       int m = word1.length()+1;
       int n = word2.length()+1;

       int dp[][]= new int[n][m];
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(i==0) dp[i][j] = j;
            else
            if(j==0) dp[i][j] = i;
        }
       }

       for(int i=1;i <n; i++){
        for(int j=1; j<m; j++){
            if(word2.charAt(i-1)== word1.charAt(j-1)){
                dp[i][j]= dp[i-1][j-1];
            } else {
                int add = dp[i-1][j];
                int del = dp[i][j-1];
                int rep = dp[i-1][j-1];
                dp[i][j]= Math.min(add, Math.min(del, rep))+1;
            }
        }
       }
       System.out.println(dp[n-1][m-1]);

    }
}