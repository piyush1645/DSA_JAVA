public class butterfly {
    public static void main(String[] args) {
        int start=0;
        int end=7;

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(j>start && j<end){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i>=4){
                start--;
                end++;
            }
            else if(i<3){
                start++;
                end--; 
            }
            System.out.println();            
        }
    }
}
