package Leetcode.HashMap;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int [] array = {3,2,4};
        int [] ans = new int[2];
        ans = twoSum(array, 6);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] twoSumUsualMethod(int[] nums, int target) {
        int n = nums.length;
        int [] ans = new int[2];
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (nums[i]+nums[j]==target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }

        }
        return ans;
    }
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        int arr [] = new int[2];

        for (int i=0; i<nums.length; i++) {
            if (hmap.containsKey(target - nums[i])) {
                arr[0] = hmap.get(target - nums[i]);
                arr[1] = i;
                break;
            } else {
                hmap.put (nums[i], i);
            }
        }
        return arr;
    }
}
