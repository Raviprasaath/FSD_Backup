package Leetcode.Arrays;
import java.util.Arrays;
public class MaxNumberofKSumPairs_1679 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(array, k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sum = nums[left]+nums[right];
            if (sum == k) {
                left++;
                right--;
                count++;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        
        return count;
    }
}
