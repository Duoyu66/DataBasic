package Test08;

import java.util.Arrays;
import java.util.HashMap;

public class Test08 {
    public static void main(String[] args) {
        Test08 test08 = new Test08();
        int[] nums = new int[]{2, 7, 11, 15};
//        System.out.println(test08.removeElement());
        System.out.println(test08.longestPalindrome("abb"));
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
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
//                        left++;
                        break;
                    }

                }

            }
        }
        if (nums[nums.length - 1] != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[nums.length - 1];
                    nums[nums.length - 1] = 0;
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                return new int[]{target - numbers[i] , numbers[i]};
            }
            hashMap.put(numbers[i], i);
        }

        return new int[0];
    }

    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

    //s --10
    public String longestPalindrome(String s) {
        //判断单字符字符串和字符串本身就是回文字符串的情况
        if (s.length() == 1||isPalindrome(s)) {
            return s;
        }
        boolean flag=false;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            int start = 0;
            int len = s.length() - 1-count;//要截取的长度
            int end = start + len - 1;
            String sNew = "";
            System.out.println("此时的长度是:"+len);
            //从长度为字符串长度-1的长度开始遍历
            while (end < s.length()) { //0 9
                sNew = s.substring(start, end+1);
                if (isPalindrome(sNew) && sNew.length() > 1) {
                    flag=true;
                    return sNew;
                } else {
                    start++;
                    end++;
                }
            }
            count++;
        }
        //如果该字符串及子字符串都不是回文字符串，则返回第一个字符的字符串
        char []ch= s.toCharArray();
        return ch[0]+"";
    }
    // 判断一个字符串是否为回文串
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
