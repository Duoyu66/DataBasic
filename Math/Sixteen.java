package Math;
/**
 * 转换为16进制
 * */
public class Sixteen {
    public static void main(String[] args) {

    }
    public String toHex(int num) {
if (num<0){return "ffffffff";}
        return Integer.toString(num,16);
    }
}
