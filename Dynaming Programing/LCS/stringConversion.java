public class stringConversion {
    public static void main(String[] args) {
        String str1 = "rpa";
        String str2 = "rupesh";

         int dp[][] = new int[str1.length()+1][str2.length()+1];

         // finding the LCS
         for(int i=1; i<str1.length()+1; i++){
            for(int j=1; j<str2.length()+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1] +1;

                } else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
         }
         int lcs =  dp[str1.length()][str2.length()];
System.out.println(lcs);
         int delete = str1.length()-lcs;
         int insert = str2.length()-lcs;

         System.out.println("delete operation is " +delete+ "\n" +"insert operation is " +insert);
       }
}
