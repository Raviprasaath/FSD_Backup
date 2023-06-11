package Testing;

import java.util.ArrayList;
import java.util.HashMap;

public class roughwork3 {

    public static void main(String[] args) {
        String str = "abba";
        String str2 = "dog dog dog dog";
        System.out.println(wordPattern(str, str2));
    }
    public static boolean wordPattern(String pattern, String s) {

        String [] str = s.split(" ");
        ArrayList<Character> listPattern = new ArrayList<>();
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
        System.out.println(listPattern);
        System.out.println(listS);
        if (pattern.length() != str.length && listS.size() != listPattern.size()) {
            return false;
        }
        HashMap<Character, String> hmap = new HashMap<>();

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