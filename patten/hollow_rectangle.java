public class hollow_rectangle {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            if(i==0 || i==3){
                for(int j=0;j<5;j++){
                    System.out.print("*");
                } 
            }else{
               for(int k=0;k<5;k++)
               {
                    if(k>0 && k<4){
                    System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
