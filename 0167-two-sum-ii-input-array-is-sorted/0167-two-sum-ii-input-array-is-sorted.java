class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(target==numbers[i]+numbers[j]){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }

                
            }
        }
        return null;
    }
}