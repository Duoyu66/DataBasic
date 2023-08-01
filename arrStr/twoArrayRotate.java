package arrStr;

public class twoArrayRotate {
    public static void main(String[] args) {
        int[][] arr = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        twoArrayRotate tAR = new twoArrayRotate();
        tAR.rotate(arr);
        System.out.println();
    }

    public void rotate(int[][] matrix) {




        for (int [] arr: matrix) {
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
//        System.out.println(matrix);
    }
}
