package Hash;

import java.util.HashMap;
import java.util.Map;

//同构字符串
public class SameStr {
    public static void main(String[] args) {
        SameStr sameStr = new SameStr();
        System.out.println(sameStr.isIsomorphic("papper","title"));
    }
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            //判断s中的字符在map中是否存在
            if(!map.containsKey(s.charAt(i))){
                //s中的字符不存在，t的字符不存在就加入
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
                    //否则报false
                }else{
                    return false;
                }
                //如果二者都不存在就判断映射是否相同，如果不同，直接false
            }else if(map.get(s.charAt(i)) != t.charAt(i)) return false;
        }
        return true;
    }
}
