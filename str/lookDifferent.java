package str;

import java.util.ArrayList;
/*
* 找不同
* */
public class lookDifferent {
    public static void main(String[] args) {

        lookDifferent lookdifferent = new lookDifferent();
        String str = "abcd";
        String str2="abcde";


        System.out.println(lookdifferent.findTheDifference(str,str2));
    }
    public char findTheDifference(String s, String t) {
        char []chS = s.toCharArray();
        char []chT = t.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < chT.length; i++) {
            list.add(chT[i]);
        }
        for (int i = 0; i < chS.length; i++) {
            if (list.contains(chS[i])){
                list.remove(list.indexOf(chS[i]));
            }
        }
        return list.get(0);
    }
}
