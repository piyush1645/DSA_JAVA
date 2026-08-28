class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        dp[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--) {

            for(int j = i + 1; j <= i + nums[i] && j < n; j++) {

                if(dp[j] != -1) {
                    dp[i] = 1 + dp[j];
                    break;
                }
            }
        }

        return dp[0] != -1;
    }
}