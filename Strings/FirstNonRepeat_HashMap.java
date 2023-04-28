package Strings;
import java.util.HashMap;

public class FirstNonRepeat_HashMap {
    public static void main(String[] args) {
        String str = "aargmbfm";
        
        HashMap <Character, Integer> hmap = new HashMap<>();
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
        }
        System.out.println(hmap);
        // {a=2, r=1, b=1, f=1, g=1, m=2}

        for (int i=0; i<str.length(); i++) {
            if (hmap.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
