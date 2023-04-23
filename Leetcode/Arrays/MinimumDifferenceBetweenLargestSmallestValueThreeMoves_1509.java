package Leetcode.Arrays;
import java.util.Arrays;
public class MinimumDifferenceBetweenLargestSmallestValueThreeMoves_1509 {
    public static void main(String[] args) {
        int [] nums = {6,6,0,1,1,4,6};
        int ans = minDifference(nums);

        System.out.println(ans);        
    }
    public static int minDifference(int[] nums) {
        int n = nums.length;
        if (n <= 4) {
            return 0;
        }
        Arrays.sort(nums);
    
        int min = Integer.MAX_VALUE;
        for (int i=0; i<4; i++) {
            min = Math.min(min, nums[n-1-3+i] - nums[i]);
        }
        return min;
    }
}
