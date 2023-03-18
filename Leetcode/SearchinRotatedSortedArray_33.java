package Leetcode;

public class SearchinRotatedSortedArray_33 {
    public static void main(String[] args) {
        int [] nums= {7,8,9,1,2,3,4,5,6};
        int target = 8;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (nums[low] <= nums[mid]) { 
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}