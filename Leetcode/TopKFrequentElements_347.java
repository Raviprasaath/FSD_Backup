package Leetcode;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Comparator;

public class TopKFrequentElements_347 {
    public static void main(String[] args) {
        int [] array = {1,1,1,2,2,3};
        int k = 2;
        int [] ans = topKFrequent(array, k);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hmap.put (nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }

        ArrayList <HashMap.Entry <Integer, Integer>> list = new ArrayList<>();
        for (HashMap.Entry <Integer, Integer> entry: hmap.entrySet()) {
            list.add(entry);
        }

        Comparator <HashMap.Entry <Integer, Integer>> comp = new Comparator <HashMap.Entry<Integer, Integer>>() {
            public int compare(HashMap.Entry <Integer, Integer> o1, HashMap.Entry <Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };

        Collections.sort(list, comp);
        HashMap <Integer, Integer> sortMap = new LinkedHashMap<>();

        for (HashMap.Entry <Integer, Integer> entry : list) {
            sortMap.put(entry.getKey(), entry.getValue());
        }

        ArrayList <Integer> list2 = new ArrayList<>();
        for (HashMap.Entry <Integer, Integer> entry : sortMap.entrySet()) {
            list2.add(entry.getKey());
        }

        int [] ans = new int[k];
        for (int i=0; i<k; i++) {
            ans[i] = list2.get(i);
        }
        return ans;
    }
}
