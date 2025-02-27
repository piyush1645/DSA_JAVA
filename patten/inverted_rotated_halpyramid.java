

public class inverted_rotated_halpyramid {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<=4-i+1;j++){
               System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");

               }
            System.out.println();
        }
    }
}
