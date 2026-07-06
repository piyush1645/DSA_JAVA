import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closeSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int curSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(curSum-target)<Math.abs(closeSum-target)){
                    closeSum=curSum;
                }
                if(curSum<target){
                    left++;
                }else if(curSum>target){
                    right--;
                }else{
                    return curSum;
                }
            }

        }
        return closeSum;
    }
}