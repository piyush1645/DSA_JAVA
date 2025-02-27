public class triangle_patten {
    public static void main(String[] args) {
        int num=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num);
                if(num==1){
                    num=0;
                }else{
                num=1;
                }
            }
            
            System.out.println();
        }
    }

}
