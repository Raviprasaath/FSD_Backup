package Leetcode.Arrays;
import java.util.HashMap;
public class SingleNumber_136 {
    public static void main(String[] args) {
        int [] arr = {2,2,1};
        // System.out.println(singleNumberHashMap(arr));
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int i=0; i<nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }


    public static int singleNumberHashMap(int[] nums) {
        HashMap <Integer, Integer> hmap = new HashMap <>();
        for (int i=0; i<nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i])+1);
            } else {
                hmap.put(nums[i], 1);
            }
        }
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
