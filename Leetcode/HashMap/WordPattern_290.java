package Leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class WordPattern_290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        
        String [] str = s.split(" ");
        ArrayList <Character> listPattern = new ArrayList<>();
        ArrayList <String> listS = new ArrayList<>();
        for (int i=0; i<pattern.length(); i++) {
            if (!listPattern.contains(pattern.charAt(i))) {
                listPattern.add(pattern.charAt(i));
            }
        }
        for (int i=0; i<str.length; i++) {
            if (!listS.contains(str[i])) {
                listS.add(str[i]);                
            }
        }

        if (pattern.length() != str.length || listS.size() != listPattern.size()) {
            return false;
        }
        HashMap <Character, String> hmap = new HashMap<>();
        
        for (int i=0; i<pattern.length(); i++) {
            if (!hmap.containsKey(pattern.charAt(i))) {
                hmap.put(pattern.charAt(i), str[i]);
            } else {
                 
                if (!hmap.get(pattern.charAt(i)).equals(str[i]) ) {
                    return false;
                }
            }
        }
        return true;
    }
}
