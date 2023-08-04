package DemoTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Testb {
    public static void main(String[] args) {
        int []nums = new int[]{4,3,2,7,8,2,3,1};
        Testb testb = new Testb();
        System.out.println(testb.findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],i);
            }else{
                list.add(nums[i]);
            }
        }

        return list;
    }
}
