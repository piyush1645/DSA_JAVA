public class maxsubarraysumprifix {
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prifix[]=new int[arr.length];
        prifix[0]=arr[0];
        for(int i=1;i<prifix.length;i++){
            prifix[i]=prifix[i-1]+arr[i];

        }


        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                 int end=j;
                 currsum=0;
                
                    currsum=start==0?prifix[end]:prifix[end]-prifix[start-1];
                    if(currsum>maxsum){
                         maxsum=currsum;
                    }
                
            }
                
        }
        System.out.println("maxsum="+maxsum);

    }
}
