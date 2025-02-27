public class number_pyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            //space
            for(int j=5;j>i;j--){
                System.out.print(" ");
            } 
            for(int j=0;j<=i;j++){
                System.out.print(" "+(i+1));
            }
            System.out.println();
        }
    }
}
