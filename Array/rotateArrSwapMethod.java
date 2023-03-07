package Array;

import java.util.ArrayList;

public class rotateArrSwapMethod {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};
        int kTimes=3;

        rotate(array, kTimes);
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0; i<array.length; i++){
            list.add(array[i]);
        }
        System.out.println(list);

    }
    public static void rotate(int[] nums, int k){
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp        = nums[start];
            nums[start++]   = nums[end];
            nums[end--]     = temp;
        }
    }
}
