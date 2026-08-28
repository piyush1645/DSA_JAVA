class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans1=robRange(nums,0,n-2);
        int ans2=robRange(nums,1,n-1);

        return Math.max(ans1,ans2);
    }
    public int robRange(int nums[],int start,int end){
       int size = end - start + 1;

        int dp[] = new int[size + 1];
        dp[0] = 0;
        dp[1] = nums[start];
        for(int i=2;i<=size;i++){
               dp[i] = Math.max(
                dp[i - 1],
                nums[start + i - 1] + dp[i - 2]
            );
        }
        

       return dp[size];
    }
}