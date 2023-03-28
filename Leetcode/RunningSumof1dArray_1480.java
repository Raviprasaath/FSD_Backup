package Leetcode;

public class RunningSumof1dArray_1480 {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1};
        int [] ans = runningSum(arr);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums) {
        int count = 0;
        int [] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            count += nums[i];
            ans[i] = count;
        }
        return ans;  
    }
}
