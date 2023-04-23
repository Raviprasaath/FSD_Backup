package Leetcode.ArrayList;
import java.util.ArrayList;

public class SumOfAllUniqueElements_1748 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        System.out.print(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {        
        int n = nums.length;
        int sum = 0;
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(list2.contains(nums[i])) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        for(int i=0; i<n; i++) {
            if (!list1.contains(nums[i])) {
                sum+=nums[i];
            }
        }
        return sum;
    }
}
