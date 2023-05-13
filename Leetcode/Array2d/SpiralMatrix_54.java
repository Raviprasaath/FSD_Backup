package Leetcode.Array2d;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List <Integer> ans = spiralOrder(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int p1 = n, p2 = m, k = 0;
        ArrayList <Integer> list = new ArrayList<>();
        while (k < p1 && k < p2) {
            
            for (int i=k; i<p2; i++) {
                if (list.size() < n*m)
                    list.add (matrix[k][i]);                
            } 
            for (int i=k+1; i<p1; i++) {
                if (list.size() < n*m) 
                    list.add (matrix[i][p2-1]);
            } 
            for (int i=p2-2; i>=k; i--) {
                if (list.size() < n*m) 
                    list.add (matrix[p1-1][i]);
            } 
            for (int i=p1-2; i>k; i--) {
                if (list.size() < n*m)
                    list.add (matrix[i][k]);
            }  

            k++;
            p1--;
            p2--;
        }
        return list;
    }
}
