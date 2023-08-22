package Test08;

import java.util.HashMap;

public class Test22 {
    public static void main(String[] args) {
        Test22 test22 = new Test22();
        int []nums= new int[]{1,2,3,4};
        System.out.println(test22.sumOfSquares(nums));
    }

    public String largestPalindromic(String num) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
//            hashMap.put(Integer.parseInt(num.charAt(i)+""),hashMap.getOrDefault(num.charAt(i)+""),0+1);
        }
        return "123";
    }

    //    public boolean isHunwen(String str){
//
//        return true;
//    }
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            if (Integer.parseInt(details[i].substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }

    public int sumOfSquares(int[] nums) {

        return 1;
    }
}
