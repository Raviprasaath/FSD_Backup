package Leetcode.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
        }  
      }
    
      public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]= temp;
            k++;
            }
        }
      }
}
