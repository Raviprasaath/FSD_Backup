package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class roughwork {
  	public static void main(String[] args) {
		int [] array = {3,1,4,1,5};
        System.out.println(findPairs(array, 2));
	}
    public static int findPairs(int[] nums, int k) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }
        int result = 0;
        for (int x : hmap.keySet()) {
            if (k > 0 && hmap.containsKey(x + k) || k == 0 && hmap.get(x) > 1) {
                result ++;
            }
        }
        return result;
    }
}


    
  


