package Leetcode.Arrays;

public class SmallestRangeI_908 {
    public static void main(String[] args) {
        int [] array = {1,3,6};
        int k = 3;
        System.out.println(smallestRangeI(array, k));
    }
    public static int smallestRangeI(int[] A, int k) {
        int min = A[0];
        int max = A[0];
        for (int i=0; i<A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        if (min + k >= max - k) {
            return 0;
        } else {
            return (max - k) - (min + k);
        }
    }
}
