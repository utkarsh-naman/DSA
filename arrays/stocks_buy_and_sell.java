package arrays;

public class stocks_buy_and_sell {
  public static int solution(int[] prices){
    int profit = 0;
    int n = prices.length;
    
    for (int i = 1; i < n; i++){
      if(prices[i] > prices[i-1]){
        profit += prices[i] - prices[i-1];
      }
    }
    return (profit > 0)? profit: 0;
  }
}
