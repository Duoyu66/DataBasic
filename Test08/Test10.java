package Test08;

import java.util.ArrayList;
import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

        Test10 test10 = new Test10();
        char[] ch = new char[]{'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        test10.reverseWords(ch);

        System.out.println(Test10.resverse("nihao"));
    }

    public void reverseWords(char[] s) {//['t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e']
        ArrayList<String> arrayList = new ArrayList<>();
        String str = new String(s);
        String[] strs = str.split(" ");
        System.out.println("strs的长度是"+strs.length);
        System.out.println("s的长度是"+s.length);
        for (int i = strs.length-1; i >=0; i --) {
            strs[i] = resverse(strs[i]);
            char []c = strs[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                arrayList.add(c[j]+"");

            }
            arrayList.add(" ");
//            strs[i + 1] = " ";

        }
        int k=0;
        arrayList.remove(arrayList.size()-1);
        for( String l:arrayList){
            s[k]=l.toCharArray()[0];
            k++;
        }
//        System.out.println("arrayList的值"+arrayList);
//        System.out.println(Arrays.toString(strs));
//        System.out.println("s最终是"+ Arrays.toString(s));
    }

    public static String resverse(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            char temp = ch[right];
            ch[right] = ch[left];
            ch[left] = temp;
            left++;
            right--;
        }
        String s = new String(ch);
        return s;
    }
}
