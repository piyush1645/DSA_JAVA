class Solution {
    public int palindromePartition(String s, int k) {
        int n=s.length();

        //cost[i][j]// cost[i][j] = i થી j સુધી palindrome બનાવવા minimum changes
        int cost[][]=new int[n][n];

        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                
                    if(s.charAt(i)==s.charAt(j)){
                        cost[i][j]=0;
                    }else{
                        cost[i][j]=1;
                    }

                    if(j-i>1){
                        cost[i][j]+=cost[i+1][j-1];
                    }
                
            }
        }
        // dp[i][p] = first i characters, p parts
        int[][] dp=new int[n+1][k+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=k;j++){
                dp[i][j]=1000000;
            }
        }

        dp[0][0]=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                for(int x=j-1;x<i;x++){
                    dp[i][j]=Math.min(dp[i][j],dp[x][j-1]+cost[x][i-1]);
                }
            }
        }
        return dp[n][k];
    }
}