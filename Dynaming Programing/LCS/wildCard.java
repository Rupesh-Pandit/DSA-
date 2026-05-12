public class wildCard {

    public static void main(String[] args) {
        String str = "";
        String pattern = "";
        int n=str.length();
        int  m = pattern.length();

        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] =  true;
        // initilization of dp array

        for(int i=1; i<n+1; i++) dp[i][0] = false;

        for(int j=1; j<m+1; j++){
            if(str.charAt(j-1) == '*') dp[0][j]= dp[0][j-1];
            else 
                dp[0][j]= false;
        }


        for(int i =1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str.charAt(i-1)== pattern.charAt(j-1) && pattern.charAt(j-1) == '?'){
                    dp[i][j]= dp[i-1][j-1];
                }

                else if(pattern.charAt(j-1) =='*'){
                    dp[i][j]= dp[i][j-1] || dp[i-1][j]; // not including the * or including the * 
                } else {
                    dp[i][j]= false;
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}