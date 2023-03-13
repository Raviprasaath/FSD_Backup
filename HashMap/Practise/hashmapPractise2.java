package HashMap.Practise;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

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

//  getting the value by iterator 
        // Iterator i = s.iterator();
        // while (i.hasNext()) {
        //     Object o = i.next();
        //     Map.Entry e = (Map.Entry)o;
        //     Object time = e.getValue();
        //     Object expName = e.getKey();
        //     if (time.equals(2000)) {
        //         System.out.println(expName);
        //     }
        // }

//  get the value and set and change the value
        System.out.println("Before time change"+" "+ s);
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            Map.Entry e = (Map.Entry)o;
            Object time = e.getValue();
            Object expName = e.getKey();
            if (time.equals(2000)) {
                e.setValue(2230);
            }
        }
        System.out.println("After time change"+" "+ s);
    }
}
