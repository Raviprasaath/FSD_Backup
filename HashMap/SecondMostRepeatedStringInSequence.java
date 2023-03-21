package HashMap;
import java.util.HashMap;

public class SecondMostRepeatedStringInSequence {
    public static void main(String[] args) {
        String [] str = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"}; 
        HashMap <String, Integer> hmap = new HashMap<>();
        for (int i=0; i<str.length; i++) {
            hmap.put(str[i], hmap.getOrDefault(str[i], 0)+1);
        }
        int max = 0;
        for (HashMap.Entry <String, Integer> entry : hmap.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        int smax = 0;
        for (HashMap.Entry <String, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() != max) {
                smax = Math.max(smax, entry.getValue());
            }
        }
        for (HashMap.Entry <String, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == smax) {
                System.out.println(entry.getKey());
            }
        }
    }
}
