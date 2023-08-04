package DemoTest;

import java.util.Arrays;
import java.util.HashMap;

/*
* 两数之和
* */
public class Test0802a {
    public static void main(String[] args) {
        Test0802a test0802a = new Test0802a();
        int []nums = new int[]{2,7,11,15};

        System.out.println(Arrays.toString(test0802a.twoSum(nums, 9)));
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }else{
                hashMap.put(nums[i],i);
            }

        }

        return new int[0];
    }
}
