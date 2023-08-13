package Test08;

import java.util.Arrays;

public class Test13 {
    public int flag = 0, sum = 0;

    public static void main(String[] args) {
        Test13 test13 = new Test13();

        System.out.println(test13.clumsy(5));
    }

    public int clumsy(int n) {

//        for (int i = 0; i < n; i++) {
//            switch (flag){
//                case '0':
//            }
//        }
//        if (n==1){
//            return 1;
//        }else{
//            switch (flag){
//                case 0:
//                    sum+=clumsy(n-1)*n;
//                    System.out.println("*"+sum);
//                    flag+=1;
//                case 1:
//                    sum+=clumsy(n-1)/n;
//                    System.out.println("/"+sum);
//                    flag+=1;
//                case 2:
//                    sum+=clumsy(n-1)+n;
//                    System.out.println("+"+sum);
//                    flag+=1;
//                case 3:
//                    sum+=clumsy(n-1)-n;
//                    System.out.println("-"+sum);
//                    flag=0;
//            }
//        }

        int[] arr = new int[n];
        int j = 0;
        for (int i = n; i > 0; i--) {
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }
}
