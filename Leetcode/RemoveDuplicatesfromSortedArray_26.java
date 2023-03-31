package Leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(arr);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}
