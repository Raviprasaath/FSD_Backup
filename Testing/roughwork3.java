package Testing;
import java.util.Arrays;
import java.util.Stack;

public class roughwork3 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(array));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0, i = 0;
        while (i < mat.length) {                    
            sum += mat[i][j];
            j++;
            i++;
        }
        int k = mat.length-1;
        while (k != -1) {
            int m=0;
            sum += mat[m][k];
            m++;
            k--;
        }

        if (mat.length %2 != 0) {
            sum -= mat[mat.length/2][mat.length/2];  
        }
        return sum;
    }
    
}