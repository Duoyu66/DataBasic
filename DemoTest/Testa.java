package DemoTest;

import java.util.ArrayList;
import java.util.HashSet;

/*
* 删除有序数组中的重复项
* */
public class Testa {
    public static void main(String[] args) {
        Testa testa = new Testa();
        int []nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(testa.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }else{
                arrayList.add(nums[i]);
            }
        }
        return arrayList.size();
    }
}
