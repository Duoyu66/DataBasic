package dp;

public class Stairs {
    public static void main(String[] args) {
        Stairs stairs = new Stairs();
        System.out.println(stairs.climbStairs(3));
    }
    public int climbStairs(int n) {
        int []dp = new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
