package Leetcode;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "egg";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
    }

    public static boolean isIsomorphic(String s, String t) {        
        HashMap <Character, Integer> hmap1 = new HashMap<>();
        HashMap <Character, Integer> hmap2 = new HashMap<>();
        
        for (Integer i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (hmap1.put(ch1, i) != hmap2.put(ch2, i)) {
                return false;
            }
        }
        return true;        
    }
}