package Leetcode.HashMap;
import java.util.HashMap;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap <Integer, Integer> hmap = new HashMap <>();
        for (int i=0; i<n; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > n/2) {
                ans = entry.getKey();
            }
        }        
        return ans;
    }
}
