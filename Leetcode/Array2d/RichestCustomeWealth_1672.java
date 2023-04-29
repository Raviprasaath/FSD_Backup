package Leetcode.Array2d;

public class RichestCustomeWealth_1672 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(array));
    }
    public static int maximumWealth(int[][] accounts) {
        int row = 0;
        int max = 0;
        while (row != accounts.length) {
            int sum = 0;
            for (int i=0; i<accounts[0].length; i++) {
                sum += accounts[row][i];
            }
            max = Math.max(sum, max);
            row++;
        }
        return max;    
    }
}
