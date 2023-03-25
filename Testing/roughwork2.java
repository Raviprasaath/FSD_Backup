package Testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class roughwork2 {
    public static void main(String[] args) {
        int [] array = {2,4,3,3,5,4,9,6};
        int k = 4;
        int [] arr = mostCompetitive(array, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] mostCompetitive(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int digit = 0;
        int remain = 0;
        int m = 1;
        for (int i=0; i<nums.length-k; i++) {
            for (int j=i; j<k; j++) {
                digit = nums[j] * m;
                m = m*10;
                remain = remain+digit;
            }
            min = Math.min(remain, min);
        }

        int [] ans = new int[k];
        String arr = ""+min;
        for (int i=0; i<k; i++) {
            ans[i] = arr.charAt(i);
        }
        return ans;
    }
}
