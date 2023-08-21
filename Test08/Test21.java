package Test08;

import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        Test21 test21 = new Test21();

        int []newArr = new int[]{1,2,3};
        System.out.println(test21.findNonMinOrMax(newArr));

    }

    public int largestAltitude(int[] gain) {
        int count = gain[0];
        int sum = gain[0];
        for (int i = 1; i < gain.length; i++) {
            count += gain[i];
            if (count > sum) {
                sum = count;
            }
            System.out.println("sum = " + sum);
        }
        if (sum < 0) return 0;
        return sum;
    }

    public int sumOfDigits(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int sum = 0;
        String str = min + "";
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum % 2 == 0 ? 1 : 0;
    }

    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == j && grid[i][j] == 0) {
                    return false;
                } else if (i + j == grid.length - 1 && grid[i][j] == 0) {
                    return false;
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
//            int len=grid.length;
//            if (grid[i][i+len-1]==0){
//                return false;
//            }

        }
        return true;
    }

    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }
        while (arrayList.contains(original)) {
            original = original * 2;
        }
        return original;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum *= nums[j];
                }
            }
            result[i] = sum;
        }

        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        numRows -= 1;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> list = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }

    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int sum = 0;
        int len = nums1.length;
        for (int i = 0; i < nums1.length; i++) {
            sum += nums1[i] * nums2[nums1.length - 1 - i];
            System.out.println("sum = " + sum);
        }

        return sum;
    }

    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            int mx = 0;
            for (int i = 0; i < m; i++) {
                mx = Math.max(mx, grid[i][j]);
            }
            res += mx;
        }
        return res;
    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0]+prices[1]>money){
            return money;
        }else{
            return money-prices[0]-prices[1];
        }

    }
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        return nums[1];
    }
    public int[] missingTwo(int[] nums) {
        int []result = new int[2];
        Arrays.sort(nums);
        int k=0;
        if (nums.length==1&&nums[0]==1)return new int[]{2,3};
        if (nums.length==1&&nums[0]==2)return new int[]{3,1};
        if (nums.length==1&&nums[0]==3)return new int[]{2,1};
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==i+1){
                result[k]=nums[i];
                k++;
            }
        }
        return result;
    }
}
