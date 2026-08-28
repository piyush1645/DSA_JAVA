class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int w=word2.length();
        
        int dp[][]=new int [n+1][w+1];

        //ini
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<w+1;i++){
            dp[0][i]=i;
        }

        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int ans1=dp[i-1][j]+1;

                    int ans2=dp[i][j-1]+1;

                    int ans3=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(ans3,Math.min(ans1,ans2));

                }
            }
        }
        return dp[n][w];
    }
}