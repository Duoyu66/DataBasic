package arrStr;

public class DifferentRoads {
    public static void main(String[] args) {

        DifferentRoads differentRoads = new DifferentRoads();
        System.out.println(differentRoads.uniquePaths(3,7));
    }
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=1;
        }

        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
//        for(int row=0;row<dp.length;row++){
//            for(int col=0;col<dp[row].length;col++){
//                System.out.print(dp[row][col]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(dp[m-1][n-1]);
        return dp[m-1][n-1];
    }
}
