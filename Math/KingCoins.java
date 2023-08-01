package Math;

public class KingCoins {
    public static void main(String[] args) {
int []arr = new int[]{2,3,10};
        KingCoins kingCoins = new KingCoins();
        System.out.println(kingCoins.minCount(arr));
    }
    public int minCount(int[] coins) {
        int count =0 ;
        for (int i = 0; i <coins.length ; i++) {
            if(coins[i]%2==0){
                count+=coins[i]/2;
            }else{
                count+=(coins[i]+1)/2;
            }
        }
        return count;
    }
}
