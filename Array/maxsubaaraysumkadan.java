public class maxsubaaraysumkadan {
    public static void main(String[] args) {
        int arr[]={1,-1,-2,3,4,-3};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(currsum+arr[i]>=0){
                    currsum=currsum+arr[i];
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
        }
        System.out.println("maxsum="+maxsum);
    }
}
