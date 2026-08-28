class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int w=amount;
        int dp[][]=new int[n+1][w+1];
        //ini
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<w+1;i++){
            dp[0][i]=Integer.MAX_VALUE-1;
        }

        //bottom up++
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(coins[i-1]<=j){
                    //valid
                    //include
                    int ans1=1+dp[i][j-coins[i-1]];
                    //exclude
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.min(ans1,ans2);

                }else{
                    //exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        if(dp[n][w] == Integer.MAX_VALUE - 1){
    return -1;
}

return dp[n][w];
    }
}