package Leetcode.Arrays;

public class ShuffletheArray_1470 {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int n = 3;
        int [] ans = shuffle(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        
        int ans [] = new int[n*2];
        int k = 0;
        for (int i=0; i<n*2; i=i+2) {
            ans[i] = nums[k];
            k++;
        }
        int j = 0;
        for (int i=1; i<n*2; i=i+2) {
            ans[i] = nums[j+n];
            j++;
        }

        return ans;
    }
}

