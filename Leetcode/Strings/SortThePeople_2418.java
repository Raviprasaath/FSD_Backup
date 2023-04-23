package Leetcode.Strings;
import java.util.HashMap;
import java.util.Arrays;

public class SortThePeople_2418 {
    public static void main(String[] args) {
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        String [] ans = sortPeople(names, heights);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }   
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer, String> hmap = new HashMap<>();
        for (int i=0; i<names.length; i++) {
            hmap.put (heights[i],names[i]);
        }
        String arr [] = new String [names.length];
        
        Arrays.sort(heights);
        int index = 0;
        for (int i=names.length-1; i>=0; i--) {
            arr[index] = hmap.get(heights[i]);
            index++;
        }
        return arr;
    }
}
