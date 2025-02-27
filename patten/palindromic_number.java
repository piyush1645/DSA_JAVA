public class palindromic_number {
        public static void main(String[] args) {
            int patten=1;
            for(int i=1;i<=5;i++){
                //space
                for(int j=5;j>i;j--){
                    System.out.print(" ");
                } 
                patten=i;
                for(int j=1;j<=(i*2)-1;j++){
                    
                    System.out.print(patten);  

                    if (j < i) {
                        patten--; 
                    } else {
                        patten++; 
                    }
            }
            System.out.println();   

        }
}}
