package Test08;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        Test04 test04 = new Test04();
        int[] arr = new int[]{4, 6, 2, 3, 8, 6, 10, 1};
        System.out.println(Arrays.toString(test04.Maopao(arr)));

    }

    //冒泡
    public static int[] Maopao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //二分排序
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length-1;

        while (left<=right){
            int mid = (right-left)/2+right;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                right = mid -1 ;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
