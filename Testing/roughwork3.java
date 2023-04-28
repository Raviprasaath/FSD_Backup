package Testing;
import java.util.HashMap;

public class roughwork3 {
    public static void main(String[] args) {
        int [] array = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, array)); 
    }
    public static int minSubArrayLen(int target, int[] nums) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        int min = 0;
        for (int i=0; i<nums.length; i++) {
            if (hmap.containsKey(target - nums[i])) {
                count++;
            } else {
                hmap.put (nums[i], i);
            }
            min = count;
            min = Math.min(min, count);
        }
        return min;
    }
}
