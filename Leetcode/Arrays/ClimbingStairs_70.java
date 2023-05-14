package Leetcode.Arrays;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int [] arr = new int[n+1];
        arr [0] = 1;
        arr [1] = 1;

        for (int i=2; i<=n; i++) {
            arr[i]= arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
