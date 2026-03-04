public class SellAndBuyStock {
    public static int Stock(int stock[]){
        int Maxprofit=0;
        int Bp= Integer.MAX_VALUE;
    
        for(int i=0; i<stock.length; i++){
            if(Bp < stock[i]){
                int profit = stock[i] - Bp;
                Maxprofit = Math.max(Maxprofit, profit);
        
            }else {
                Bp= stock[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(Stock(arr));
        
    }
}
