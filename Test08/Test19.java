package Test08;

import java.util.List;

public class Test19 {
    public static void main(String[] args) {
        Test19 test19 = new Test19();
        System.out.println(test19.isCommon(18));
    }

    public int countPairs(List<Integer> nums, int target) {

        int count = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numberOfBeautifulIntegers(int low, int high, int k) {
        int count = 0;
        for (int i = low; i <= high; i++) {
                    if (isCommon(i)&&i%k==0){
                        count++;;
                    }
        }

        return count;
    }

    public boolean isCommon(int number) {
        int ji = 0;
        int ou = 0;
        String str = number + "";
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(str.charAt(i) + "") % 2 == 0) {
                ji++;
            } else {
                ou++;
            }
        }
        return ji == ou;
    }
}
