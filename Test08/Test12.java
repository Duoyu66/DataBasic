package Test08;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        Test12 test12 = new Test12();
        int [][]mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(mat));
        System.out.println(test12.diagonalSum(mat));
    }
    public int diagonalSum(int[][] mat) {
        int len =mat.length;
        int k=1;
        int sum = 0;
        for (int i = 0; i < len; i++,k=k+2) {
            sum+=mat[i][i]+mat[i][i+len-k];
        }
        System.out.println();
        if(mat.length%2!=0){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}