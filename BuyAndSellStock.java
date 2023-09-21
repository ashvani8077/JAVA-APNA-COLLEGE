public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buyP=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i=0;i< prices.length;i++){
            if (buyP<prices[i]){

                int profit=prices[i]-buyP;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyP=prices[i];
            }
        }
        System.out.println(maxprofit);
    }
}
