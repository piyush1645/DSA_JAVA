class Solution {
    public boolean canCross(int[] stones) {
        int n=stones.length;
        HashSet<Integer>[] dp=new HashSet[n];
        for(int i=0;i<n;i++){
            dp[i]=new HashSet<>();
        }

        //ini
        dp[0].add(0);

        for(int i=0;i<n;i++){
            for(int jump : dp[i]){
                for(int j=jump-1;j<=jump+1;j++){
                    if(j<=0){
                        continue;
                    }
                    int position=stones[i]+j;
                    for(int k=i+1;k<n;k++){
                        if(stones[k]==position){
                            dp[k].add(j);
                        }
                    }
                }
            }
        }
        return !dp[n-1].isEmpty();
    }
}