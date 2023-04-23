package Leetcode.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class SortArraybyIncreasingFrequency_1636 {
    public static void main (String[] args) {
        int [] nums = {-1,1,-6,4,5,-6,1,4,1};
        int [] ans = frequencySort(nums);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] frequencySort(int[] nums) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(hmap);
        int arr[] = new int [nums.length];
    
        ArrayList <Integer> list = new ArrayList<>(hmap.keySet());
        Collections.sort(list, (a,b)-> {
            if (hmap.get(a) == hmap.get(b)) {
                return b-a;
            } else {
                return hmap.get(a)-hmap.get(b);
            }
        });

        int i = 0;
        for (int num : list) {
            for (int j=0; j<hmap.get(num); j++) {
                arr[i++] = num;
            } 
        }
        return arr;
    }
}
