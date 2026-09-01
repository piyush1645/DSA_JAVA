class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int w=sum/2;
        //make dp
        int dp[][]=new int[n+1][w+1];

        //ini
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<w+1;i++){
            dp[0][i]=0;
        }

        //bootom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(nums[i-1] <= j){
                    //valid
                    //iunclude
                    int include=nums[i-1]+dp[i-1][j-nums[i-1]];
                    //exclude
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }else{
                    //exclude
                    dp[i][j]=dp[i-1][j];

                }
            }
        }
        if(dp[n][w]==sum/2){
            return true;
        }
    return false;
    }
}