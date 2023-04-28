package Strings;
import java.util.ArrayList;
import java.util.HashMap;

public class FirstUniqueCharacterinString387_method2 {
    public static void main(String[] args) {
        String s = "andnandaeis";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s) {
        HashMap <Character, Integer> hmap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0)+1 );
        }
        System.out.println(hmap);
        int index = 0;
        for (int i=0; i<s.length(); i++) {
            if (hmap.get(s.charAt(i))==1 ) {
                index = i;
                break;
            }
        }
        
        return index;
    }



    public static int firstUniqChar1(String s) {
        ArrayList <Character> list1 = new ArrayList<>();
        ArrayList <Character> list2 = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (list1.contains(s.charAt(i))) {
                list2.add(s.charAt(i));
            } else {
                list1.add(s.charAt(i));
            }
        }
        int ans = 0;
        for (int i=0; i<s.length(); i++) {
            if (!list2.contains(s.charAt(i))) {
                ans = i;
                break;
            } else {
                ans = -1;
            }
        }
        return ans;
    }
}
