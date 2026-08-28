class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum + target < 0)
            return 0;

        if((sum + target) % 2 != 0)
            return 0;
        
        int subset=(sum+target)/2;
        int dp[][]=new int [n+1][subset+1];
        //inilization
        dp[0][0]=1;
        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=0;j<subset+1;j++){
                if(nums[i-1]<=j){
                    //valid
                    //include
                    int include=dp[i-1][j-nums[i-1]];
                    //exclude
                    int exclude=dp[i-1][j];
                    dp[i][j]=include+exclude;
                }else{
                    //exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
         return dp[n][subset];
        }
        
       
    }
