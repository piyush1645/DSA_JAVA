public class sellandbuystock {
    public static int buyandsell(int stock[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<stock.length;i++){
            if(buyprice<stock[i]){
                int profit=stock[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=stock[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int stock[]={7,1,5,3,6,4};
        System.out.println(buyandsell(stock));
    }
}
