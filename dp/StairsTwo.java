package dp;

import java.util.ArrayList;

public class StairsTwo {
    public static void main(String[] args) {
        StairsTwo stairsTwo = new StairsTwo();
//        int []cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        int []cost = new int[]{1,0,0,1};
        System.out.println(stairsTwo.minCostClimbingStairs(cost));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[cost.length+1];
        dp[0]=cost[0];
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(cost[0]);
        arrayList.add(Math.min(cost[0]+cost[1],cost[1]));
        dp[1]=Math.min(cost[0]+cost[1],cost[1]);
        for (int i = 2; i < cost.length-1; i++) {
            dp[i]=Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]);
            arrayList.add(Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]));
        }
        System.out.println(arrayList);
        return arrayList.get(arrayList.size()-1);
    }
}
