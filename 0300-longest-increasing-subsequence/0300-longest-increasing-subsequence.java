class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int nums2[]=new int[set.size()];
        int k=0;
        for(int num : set){
            nums2[k]=num;
            k++;
        }
        Arrays.sort(nums2);
        int w=nums2.length;

        int dp[][]=new int[n+1][w+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(nums[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
    return dp[n][w];

    }
}