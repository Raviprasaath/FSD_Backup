package Leetcode.Basic;

public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int [] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefix = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += nums[i];
        }
        for (int i=0; i<n; i++) {
            if (prefix == sum-prefix-nums[i]) {
                return i;
            }
            prefix += nums[i];
        }
        return -1;
    }
}
