package Leetcode.Arrays;

public class TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(array, target);
        System.out.println((ans[0]+" "+ans[1]));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int ans [] = new int[2];
        int left = 0;
        int right = numbers.length-1;

        while (left < right) {
            int sum  = numbers[left] + numbers[right];
            if (sum == target) {
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
