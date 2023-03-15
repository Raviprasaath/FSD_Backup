package Leetcode;

public class SortArrayByParityII_922 {
    public static void main(String[] args) {
        int [] arr = {4,5,2,7};
        int arr2[] = sortArrayByParityII(arr); 
        for (int i=0; i<arr.length; i++) {
         System.out.print(arr2[i]+" ");
        }
    }
   
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i=0, j=1;
        while ((i < n) && (j < n)) {
            while ((i < n) && (nums[i] %2 == 0)) {
                i = i+2;
            }
            while ((j < n) && (nums[j] %2 != 0)) {
                j = j+2;
            }
            if ((i < n) && (j < n)) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}