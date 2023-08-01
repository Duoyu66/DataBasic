package Greedy;

import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) {

        int []g=new int[]{2,1,3};
        int []s=new int[]{3,2};
        Cookies cookies = new Cookies();
        System.out.println(cookies.findContentChildren(g,s));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);

        return 1;
    }
}
