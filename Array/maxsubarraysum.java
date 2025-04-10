public class maxsubarraysum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                 int end=j;
                 currsum=0;
                for(int k=start;k<=end;k++){
                    currsum=currsum+arr[k];
                    if(currsum>maxsum){
                         maxsum=currsum;
                    }
                }
            }
                
        }
        System.out.println("maxsum"+maxsum);

    }
}