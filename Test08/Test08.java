package Test08;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        Test08 test08 = new Test08();
        int[] nums = new int[]{0, 1, 0, 3, 12};
//        System.out.println(test08.removeElement());
        test08.moveZeroes(nums);
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    //原地修改数组
    public void moveZeroes(int[] nums) {
        int left = 0, right = nums.length;
        for (int i = 0; i < right - 2; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < right - 1; j++) {
                    if (nums[j] !=0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
//                        left++;
                        break;
                    }

                }

            }
        }
     if(nums[nums.length-1]!=0){
         for (int i = 0; i < nums.length; i++) {
             if (nums[i]==0){
                 nums[i]=nums[nums.length-1];
                 nums[nums.length-1]=0;
                 break;
             }

         }
     }
        System.out.println(Arrays.toString(nums));
    }
}
