package Leetcode;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindTargetIndicesAfterSortingArray_2089 {
    public static void main(String[] args) {
        int [] nums = {1,2,5,2,3};
        
        System.out.println(targetIndices(nums, 2));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
