package dp;
/*
* 买卖股票的最佳时机
* */
public class Stock {
    public static void main(String[] args) {
        Stock stock = new Stock();
        int []prices = new int[]{7,1,5,3,6,4};
        System.out.println(stock.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        
        checkCan(prices);
        System.out.println(checkCan(prices));
        return 1;
    }
    public boolean checkCan(int nums[]){
        boolean flag =true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[0]) flag=false;
        }
        return flag;
    }
}
