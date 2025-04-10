

public class raintrapedwater {

    public static int raintrapedwater(int height[]){
        int leftMaximum[]=new int[height.length];
        int rightMaximum[]=new int[height.length];
        int totalWater =0;
        //leftmaximum
        leftMaximum[0]=height[0];
         for(int i=0;i<height.length-1;i++){
            if(leftMaximum[i]>height[i+1]){
                leftMaximum[i+1]=leftMaximum[i];

            }else{
                leftMaximum[i+1]=height[i+1];
            }
         }
         //rightmaximum
         rightMaximum[height.length-1]=height[height.length-1];
         for(int i=height.length-2;i>=0;i--){
            if(height[i]>rightMaximum[i+1]){
                rightMaximum[i]=height[i];

            }else{
                rightMaximum[i]=rightMaximum[i+1];
            }
         }
        //  for(int i=0;i<height.length;i++){
        //     System.out.print(rightMaximum[i]+" ");
        //  }

        //for how much rain water contain
        for(int i=0;i<height.length;i++){
            int waterLevel=0;
            if(leftMaximum[i]>rightMaximum[i]){
                waterLevel=rightMaximum[i];
            }else{
                waterLevel=leftMaximum[i];
            }
            totalWater=totalWater+(waterLevel-height[i]);
        }
        System.out.println(totalWater);
        
        return 0;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       
        raintrapedwater(height);

    }
}
