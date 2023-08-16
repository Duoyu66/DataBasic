package Test08;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        Test16 test16 = new Test16();
        int[] arr = new int[]{3, 1, 2, 4};
        System.out.println(test16.thousandSeparator(123456789));
    }

    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arrayListOu = new ArrayList<>();
        ArrayList<Integer> arrayListJi = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arrayListOu.add(nums[i]);
            } else {
                arrayListJi.add(nums[i]);
            }
        }
        arrayListOu.addAll(arrayListJi);
        System.out.println(arrayListOu);
        int[] result = new int[arrayListOu.size()];
        int k = 0;
        for (int a : arrayListOu) {
            result[k] = a;
            k++;
        }
        return result;
    }

    //千分位分割数
    public String thousandSeparator(int n) {
        String str = n + "";
        char[] ch = str.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            characters.add(ch[i]);
            count++;
            if (count == 3) {
                characters.add('.');
                count = 0;
            }

        }
        if (characters.get(characters.size() - 1) == '.') {
            System.out.println("是点");
            characters.remove(characters.size() - 1);
        }
        char[] newCh = new char[characters.size()];
        int q = 0;
        for (char c : characters) {
            newCh[q] = c;
            q++;
        }
        char[] resultChar = new char[newCh.length];
        for (int i = 0; i < newCh.length; i++) {
            resultChar[i]=newCh[newCh.length-i-1];
        }
        return new String(resultChar);
    }

}
