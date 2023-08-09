package Test08;

import java.util.HashMap;
import java.util.HashSet;

public class Test09 {
    public static void main(String[] args) {
        Test09 test09 = new Test09();
        String ss = "ADOBECODEBANC";
        String tt = "ABC";
        System.out.println(test09.minWindow(ss,tt));
    }
    public int lengthOfLongestSubstring(String s) {
        if(isSimple(s)){
            return s.length();
        }
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            int start = 0;
            int len = s.length() - 1-count;//要截取的长度
            int end = start + len - 1;
            String sNew = "";
//            System.out.println("此时的长度是:"+len);
            //从长度为字符串长度-1的长度开始遍历
            while (end < s.length()) { //0 9
                sNew = s.substring(start, end+1);
                if (isSimple(sNew) && sNew.length() > 1) {

                    return sNew.length();
                } else {
                    start++;
                    end++;
                }
            }
            count++;
        }

        return 1;
    }
    public static boolean isSimple(String str){
        char []ch =str.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            if(characters.contains(ch[i])){
                return false;
            }else{
                characters.add(ch[i]);
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {

        char []chAll = s.toCharArray();
        char []ch = t.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int min = 0;
        int left=0;
//        for (int i = 0; i < s.length(); i++) {
//            hashMap.put(chAll[i],i);
//        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(chAll[i])){}
        }
        return "p";
    }
//    public static boolean ContainsCh(HashMap hashMap,char[]ch2){
//        for (int i = 0; i < ; i++) {
//
//        }
//
//        return true;
//    }
}
