package Leetcode.Array2d;


public class CheckIfItIsaStraightLine_1232 {
    public static void main(String[] args) {
        int [][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        int xCoodrinates = x1 - x0;
        int yCoodrinates = y1 - y0;

        for (int i = 2; i < coordinates.length; ++i) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if ((x - x0) * yCoodrinates != (y - y0) * xCoodrinates) {
                return false;
            }
        }
        return true;
    }

}
