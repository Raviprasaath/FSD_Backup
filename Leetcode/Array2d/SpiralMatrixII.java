package Leetcode.Array2d;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int ans [][] = generateMatrix(n);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {

        int p1 = n, p2 = n, k = 0, iter = 1;

        int [][] arr = new int[n][n];
        while (k < p1 && k < p2) {
            
            for (int i=k; i<p2; i++) {
                if (n*n >= iter)
                    arr[k][i] = iter++;
            } 

            for (int i=k+1; i<p1; i++) {
                if (n*n >= iter) 
                    arr[i][p2-1] = iter++;
            } 
            for (int i=p2-2; i>=k; i--) {
                if (n*n >= iter) 
                    arr[p1-1][i] = iter++;                        
            } 

            for (int i=p1-2; i>k; i--) {
                if (n*n >= iter)
                    arr[i][k] = iter++;
            }  

            k++;
            p1--;
            p2--;
            
        }
        return arr;
    }
}
