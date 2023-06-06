package Leetcode.Arrays;

public class ArrayNesting_565 {
    public static void main(String[] args) {
        int [] array = {5,4,0,3,1,6,2};
        System.out.println(arrayNesting(array));
    }
    public static int arrayNesting(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (num == -1) {
                continue;
            }
            int index = num;
            int count = 0;
            while (nums[index] != -1) {
                int cache = index;
                index = nums[index];
                nums[cache] = -1;
                ++count;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
