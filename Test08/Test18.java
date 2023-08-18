package Test08;

import java.util.*;

public class Test18 {
    public static void main(String[] args) {

        Test18 test18 = new Test18();
//        System.out.println(test18.canPermutePalindrome("carerac"));
//        System.out.println("carerac".charAt(0));
        int[] arr = new int[]{1, 2, 2, 3, 3, 3};
        System.out.println(test18.findLucky(arr));
    }

    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            dic.put(s.charAt(i), dic.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(dic);
        for (int c : dic.values()) {
            System.out.println("ss" + c);
        }
        for (char p : dic.keySet()) {
            System.out.println("pp" + p);
        }

        return false;
    }

    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int index = 0, sum = 0;
        for (int i = 0; i < keyboard.length(); i++) {
            hashMap.put(keyboard.charAt(i), i);
        }
        for (int i = 0; i < word.length(); i++) {
            sum += Math.abs(hashMap.get(word.charAt(i)) - index);
            index = hashMap.get(word.charAt(i));
        }
        return sum;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = 0; j < allowed.length(); j++) {
                hashSet.add(allowed.charAt(j));
            }

            boolean flag = false;
            for (int j = 0; j < words[i].length(); j++) {
                flag = false;
                if (!hashSet.contains(words[i].charAt(j))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
//                System.out.println("words = " + words[i]);
            }
        }

        return count;
    }

    public boolean checkIfPangram(String sentence) {
        char[] c = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            hashSet.add(sentence.charAt(i));

        }
        for (int i = 0; i < c.length; i++) {
            if (!hashSet.contains(c[i])) {
                return false;
            }
        }
        return true;
    }

    public int distributeCandies(int[] candyType) {
        int len = candyType.length / 2;
        int count = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            hashSet.add(candyType[i]);
        }
//        for(int a:hashSet){
//            if (a<=len){
//                System.out.println(a);
//                count++;
//                len-=a;
//            }
//        }


        return Math.min(len, hashSet.size());
    }

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
                int key= entry.getKey();
                int value = entry.getValue();
                if (value==key){
                  arrayList.add(key);
                }
        }
        if (!arrayList.isEmpty()){
            return arrayList.get(arrayList.size()-1);
        }
        return -1;
    }
}

