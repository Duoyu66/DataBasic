package arrStr;

//寻找中心索引
public class findZhong {
    public static void main(String[] args) {

        int[] sums = new int[]{1, 7, 3, 6, 5, 6};
        int[] sumsz = new int[]{-1, -1, 0, 1, 1, -1};


        findZhong fZ = new findZhong();
        System.out.println(fZ.pivotIndex(sumsz));
    }

    public int pivotIndex(int[] nums) {
        int flag = -1;
        int allsum = 0;
        for (int i = 0; i < nums.length; i++) {
            allsum += nums[i];
        }
        //返回0的情况
        int rightValue = 0;
        for (int i = 1; i < nums.length; i++) {
            rightValue += nums[i];
        }
        if (rightValue == 0) {
            flag = 0;
            return flag;
        }
        //正常返回的情况
        for (int i = 1; i < nums.length; i++) {
            int leftValue = 0;
            for (int j = 0; j < i; j++) {
                leftValue += nums[j];
            }
            if (leftValue * 2 == allsum - nums[i]) {
                flag = i;
                break;
            }
        }
        return flag;
    }
}
