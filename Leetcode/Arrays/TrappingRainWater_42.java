package Leetcode.Arrays;

public class TrappingRainWater_42{
    public static void main(String[] args) {
        int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        System.out.println(trap(array));
    }
    public static int trap(int[] height) {
        int [] left = new int [height.length];
        int [] right = new int [height.length];
        int max = 0;
        int ans = 0;

        max = height[0];
        for (int i=0; i<height.length; i++) {
            left[i] = Math.max(height[i], max);
            max = left[i];
        }

        max = height[height.length-1];
        for (int i=height.length-1; i>=0; i--) {
            right[i] = Math.max(height[i], max);
            max = right[i];
        }

        for (int i=0; i<height.length; i++) {
            ans = ans + (Math.min(left[i], right[i])-height[i]);
        }
        return ans;

    }

}