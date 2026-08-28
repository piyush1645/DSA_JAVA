class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int w=sum/2;
        int dp[][]=new int[n+1][w+1];

        //initilization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<w+1;i++){
            dp[0][i]=0;
        }

        //bottom-up
        for(int i=1;i<n+1;i++){
            
            for(int j=1;j<w+1;j++){
                if(nums[i-1]<=j){
                    //valid
                    //include
                    int include=dp[i-1][j-nums[i-1]]+nums[i-1];
                    //exclude
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);

                }else{
                    //exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][w] == w;

    }
}