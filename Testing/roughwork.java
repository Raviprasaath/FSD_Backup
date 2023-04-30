package Testing;

import java.util.Arrays;

public class roughwork {
  public static void main(String[] args) {
    int [][] array = {{6,34,9},{12,55,4},{7,182,16}};
    int ans = kthSmallest(array, 1);

    System.out.println(ans);
  }
  public static int kthSmallest(int[][] matrix, int k) {
    int[] flattened = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray();
    return flattened[k - 1];


    }
}
