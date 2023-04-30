package Leetcode.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThantheCurrentNumber_1365 {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        nums = smallerNumbersThanCurrent(nums);
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] temp = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);

        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (!hmap.containsKey(temp[i])) {
                hmap.put(temp[i], i);
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            nums[i] = hmap.get(nums[i]);
        }
        
        return nums;
    }
}
