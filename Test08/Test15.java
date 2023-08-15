package Test08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test15 {
    public static void main(String[] args) {
        Test15 test15 = new Test15();
        int[] g = new int[]{3, 1, 2};
        int[] s = new int[]{6, 4, 5};
        System.out.println(test15.findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        //双指针+贪心+排序
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int m=g.length,n=s.length;
        for (int i = 0,j=0; i <m&&j<n ; i++,j++) {
            while(j<n&&g[i]>s[j]){
                j++;
            }
            if (j<n){
                count++;
            }

        }
        return count;
    }
}
