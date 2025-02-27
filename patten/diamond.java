public class diamond {
    public static void main(String[] args) {
        //upper diamond
       for(int i=1;i<=4;i++){
        for(int j=5;j>i;j--){
            System.out.print(" ");
        } 
        for(int k=0;k<(i*2)-1;k++){
            System.out.print("*");
        }
        System.out.println();
       }
       //lower diamond
       for(int i=4;i>=1;i--){
        for(int j=5;j>i;j--){
            System.out.print(" ");
        } 
        for(int k=0;k<(i*2)-1;k++){
            System.out.print("*");
        }
            System.out.println();
       }
    }
}
