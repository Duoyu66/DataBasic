package DemoTest;

import java.util.Arrays;

/**
 * 打家劫舍
 * */
public class Test0802 {
    public static void main(String[] args) {
        Test0802 test0802 = new Test0802();
        int []nums = new int[]{1,2,3,1};
        System.out.println(test0802.rob(nums));
    }
    public int rob(int[] nums) {
        int []dp = new int[nums.length];
        if(nums.length==1){
            dp[0] = nums[0];
        } else if (nums.length==2) {
            dp[1] = Math.max(nums[0],nums[1]);
        }else{
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            for (int i = 2; i <nums.length ; i++) {
                dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[dp.length-1];
    }

}
