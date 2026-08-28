class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean dp[]=new boolean[n+1];

        //ini
        dp[0]=true;

        for(int i=1;i<n+1;i++){
            for(int j=0;j<i;j++){
                String check=s.substring(j,i);
                
             if(dp[j] && wordDict.contains(check)) {
                    dp[i] = true;
                    break;
                }
            }
        
        }
        return dp[n];
    }
}