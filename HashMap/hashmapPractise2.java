package HashMap;
import java.util.HashMap;
import java.util.Set;

public class hashmapPractise2 {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("Nellai", 1900);        
        hm.put("Mannai", 2000);        
        hm.put("Cheran", 1930);        
        hm.put("Vaigai", 2000);

        System.out.println(hm); // pair of obj and keys are there
        Set s = hm.entrySet();
        System.out.println(s); // 4 entrys are there

    }
}
