class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int w=text2.length();

        int dp[][]=new int[n+1][w+1];
        //ini
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<w+1;i++){
            dp[0][i]=0;
        }

        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    //valid
                    ///include
                    dp[i][j]=1+dp[i-1][j-1];
                    
                }else{
                    //exclude
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][w];
    }
}