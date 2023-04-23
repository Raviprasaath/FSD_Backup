package Leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {
    public static void main(String[] args) {
        int [] array = {4,3,2,7,8,2,3,1};
        List <Integer> list = findDuplicates2(array);
        System.out.println(list);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hmap.put (nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        ArrayList <Integer> list = new ArrayList<>();
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static List<Integer> findDuplicates2(int[] nums) {
        List <Integer> output_arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                output_arr.add(index+1);
            }
            nums[index] = -nums[index];
        }
        return output_arr;
    }
}