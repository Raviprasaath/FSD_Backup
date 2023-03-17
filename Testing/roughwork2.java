package Testing;

import java.util.HashMap;
import java.util.ArrayList;

public class roughwork2 {
    public static void main(String[] args) {
        int [] array = {1,2};
        int k = 2;
        int [] ans = topKFrequent(array, k);
        for (int i=0; i<k; i++) {
            System.out.print(ans[i]+" ");
        }

        
    }
    public static int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hmap.put (nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(hmap);
        ArrayList <Integer> list = new ArrayList<>();
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {
            maxFreq = Math.max(maxFreq, entry.getValue());
            minFreq = Math.min(minFreq, entry.getValue());
        }
        System.out.println("max"+maxFreq);
        System.out.println("min"+minFreq);
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {
            if ((entry.getValue() > minFreq) ||  (maxFreq ==1)) {
                list.add(entry.getKey());
            }
        }
        int [] ans = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
