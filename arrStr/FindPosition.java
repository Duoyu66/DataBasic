package arrStr;

import java.util.HashMap;

//搜索插入位置
public class FindPosition {
    public static void main(String[] args) {

        FindPosition findPosition = new FindPosition();
        int[] arr = new int[]{1,3,5,6};
        System.out.println(findPosition.searchInsert(arr, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int index = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> hashMapNew = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
            hashMapNew.put(i,nums[i]);
        }
//        System.out.println(hashMap);
//        System.out.println();
        if (hashMap.containsKey(target)) {
            index = hashMap.get(target);
        }else{
            for (int i = 0; i < hashMapNew.size(); i++) {
                if(hashMapNew.get(i)>target){
                    index = i;
                    break;
                }
            }
            if(index ==-1){
                index = hashMapNew.size();
            }
        }

        return index;
    }
}
