package Leetcode;

public class SortColors_75 {
    public static void main(String[] args) {
        int [] array = {2,0,2,1,1,0};
        sortColors(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int index = 0;

        while (low < high && index <= high) {
            if (nums[index]==0) {
                nums[index] = nums[low];
                nums[low] = 0;
                low++;
                index++;
            } else if (nums[index]==2) {
                nums[index] = nums[high];
                nums[high] = 2;
                high--;
            } else {
                index++;
            }
        }
    }
}
