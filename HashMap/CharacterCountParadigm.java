package HashMap;
import java.util.HashMap;
public class CharacterCountParadigm {
    public static void main(String[] args) {
        String str = "bcadecb";
        int n = str.length();
        HashMap <Character, Integer> hmap = new HashMap<>();
        for (int i=0; i<n; i++) {
            char ch = str.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0)+ 1 );
        }

        int max = 0;
        for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        StringBuilder sb = new StringBuilder(); 
        for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == max) {
                sb.append(entry.getKey());
            }
        }
        int high = 0;
        if (sb.length() == 1) {
            System.out.print(sb);
        } else {
            for (int i=0; i<sb.length(); i++) {
                high = Math.max(high, (sb.charAt(i)-'a'));
            }
            high = high+'a';
            char c = (char)high;
            System.out.print(c);
        }
    }
}
