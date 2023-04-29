package Leetcode.Arrays;

public class FindFirstandLastPositionofElementinSortedArray_34 {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = (searchRange(nums, target));
        System.out.println(ans[0]+" "+ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int [] arr = new int[2];
        
        
        
        for(int i=0; i<n; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            } else {
                arr[0] = -1;
            }
        }
        for(int i=n-1; i>=0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            } else {
                arr[1] = -1;
            }
        } 
        if (nums.length == 0) {
            arr[0] = -1;
            arr[1] = -1;
        }
        return arr;
    }
}
