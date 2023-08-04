package Math;
/*
* 七进制数
* */
public class Seven {
    public static void main(String[] args) {
        Seven seven = new Seven();
        System.out.println(seven.convertToBase7(7));
        System.out.println(seven.convertToBase7(-7));
    }
    public String convertToBase7(int num) {

        return Integer.toString(num,7);
    }
}
