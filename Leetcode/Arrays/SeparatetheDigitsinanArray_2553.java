package Leetcode.Arrays;

public class SeparatetheDigitsinanArray_2553 {
    public static void main(String[] args) {
        int [] arr = {13,25,83,77};
        int [] ans = separateDigits(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<nums.length; i++) {
            sb.append(nums[i]);
        }

        String str = sb.toString();    

        int [] result = new int[str.length()];

        for (int i=0; i<str.length(); i++) {
            result[i] =str.charAt(i)-'0';
        }
        
        return result;
    }
}