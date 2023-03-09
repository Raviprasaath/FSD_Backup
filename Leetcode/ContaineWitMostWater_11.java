package Leetcode;

public class ContaineWitMostWater_11 {
    public static void main(String[] args) {
        int [] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;
        
        while(left<right){
            int minHeight = Math.min(height[left], height[right]);
            int distance = right-left;
            int storage = distance*minHeight;

            maxWater=Math.max(storage, maxWater);
            
            if (height[left]<=height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;   
    }
}
