package Test08;

import java.util.LinkedList;
import java.util.List;

public class Test20 {
    public static void main(String[] args) {
      Test20 test20 = new Test20();
      List<Integer> list = new LinkedList<>();
      list.add(1);
      list.add(3);
      list.add(2);
      list.add(3);
      list.add(3);
        System.out.println(test20.longestEqualSubarray(list,8));
    }
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)!=words.get(i).charAt(0)){
                return false;
            }
        }
        return true;
    }
    public int longestEqualSubarray(List<Integer> nums, int k) {


        return 1;
    }
}
