import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []merge=new int[nums1.length+nums2.length];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            merge[count]=nums1[i];
            count++;
        }
        for(int i=0;i<nums2.length;i++){
            merge[count]=nums2[i];
            count++;
        }
        Arrays.sort(merge);
        if(merge.length % 2 == 0){
            double ans=(((double)merge[merge.length/2-1]+merge[merge.length/2])/2);
            return ans;
           
        }else{
            return merge[merge.length/2];
        }
       
    }
}