package Leetcode.Arrays;

public class MaximumDifferenceBetweenIncreasingElements_2016 {
    public static void main(String[] args) {
        int [] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int ans = -1;
        int min = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > min) {
                ans = Math.max(ans, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        return ans;
    }

    //-------on^2
    // public static int maximumDifference(int[] nums) {
    //     int max = -1;
    //     for (int i=nums.length-1; i>=0; i--) {
    //         for (int j=i-1; j>=0; j--) {
    //             if (nums[j] < nums[i]) {
    //                 max = Math.max(max, nums[i]-nums[j]);
    //             }
    //         }
    //     }
    //     return max;
    // }
}
