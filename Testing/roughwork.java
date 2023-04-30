package Testing;
import java.util.HashMap;

public class roughwork {
  public static void main(String[] args) {
    String str = "1210";
    System.out.println(digitCount(str));
  }
  public static boolean digitCount(String num) {
    int n = num.length();
    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int i=0; i<n; i++) {
        int ch = num.charAt(i)-'0';
        hmap.put(ch, hmap.getOrDefault(ch, 0) +1);
    }
    
    int count = 0;
    for (int i=0; i<n; i++) {
        if (hmap.containsKey(i)) {
          count = hmap.get(i);
        } else {
          count = 0;
        }
    }

    return (count == 0?true:false);           
}
}
