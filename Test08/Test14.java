package Test08;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test14 {
    public static void main(String[] args) {
        Test14 test14 = new Test14();
        System.out.println(test14.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println((int)('7'));
    }

    public static boolean isHuiwen(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
        }
        System.out.println();
        return true;
    }

    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                arrayList.add(ch[i]);
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                arrayList.add((char) (ch[i] + 32));
            } else if ((int)ch[i]>=48&&(int)(ch[i])<=57) {
                arrayList.add( ch[i]);
            }
        }
//        if(arrayList.size()==1){
//            return false;
//        }
   char []lastCh =new char[arrayList.size()];
     int h=0;
     for(char c : arrayList){
         lastCh[h]=c;
         h++;
     }
        System.out.println("lastCh是"+ Arrays.toString(lastCh));
     int left = 0;
     int right = lastCh.length-1;
   while(left<=right){
       if(lastCh[left]!=lastCh[right]){
           return false;
       }
       left++;
       right--;
   }
        return true;
    }
}
