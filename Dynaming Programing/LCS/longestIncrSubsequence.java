

import java.util.HashSet;

class longestIncrSubsequence {
    public static int lcs(int arr1[]){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){ // to find the uniqe element
            set.add(arr1[i]);
        }

        int arr2[] =  new int[set.size()];

        int dp[][] = new int[arr1.length+1][arr2.length+1];

        int i=0;
        for(int k: set){
            arr2[i] = k;
            i++;
        }
        return lIs(arr1 , arr2, dp);
    }

    public static int lIs(int arr1[], int arr2[], int dp[][]){

        for(int i=1;i<arr1.length+1; i++){
            for(int j=1; j<arr2.length+1; j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                } else{
                    int ans1= dp[i-1][j];
                    int ans2= dp[i][j-1];
                      dp[i][j]= Math.max(ans1, ans2);
                }
            }
        }
        return dp[arr1.length][arr2.length];
    }

    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};

        System.out.println(lcs(arr));
    }
}