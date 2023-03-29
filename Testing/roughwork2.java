package Testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.List;

public class roughwork2 {
    public static void main(String[] args) {
        String [] arr = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        System.out.println(topKFrequent(arr, k));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap <String, Integer> hmap =  new HashMap<>();
        for (int i=0; i<words.length; i++) {
            hmap.put (words[i], hmap.getOrDefault(words[i], 0)+1);
        }
        System.out.println(hmap);
        ArrayList <HashMap.Entry <String, Integer>> list = new ArrayList<>();
        for (HashMap.Entry <String, Integer> entry: hmap.entrySet()) {
            list.add(entry);
        }
        
        Comparator <HashMap.Entry <String, Integer>> comp = new Comparator <HashMap.Entry <String, Integer>>() {
            public int compare(HashMap.Entry <String, Integer> o1, HashMap.Entry <String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        
        Collections.sort(list, comp);
        HashMap <String, Integer> sortMap = new LinkedHashMap<>();
        
        for (HashMap.Entry <String, Integer> entry : list) {
            sortMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("sorted ans");
        for (HashMap.Entry <String, Integer> entry : sortMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        ArrayList <String> list2 = new ArrayList<>();
`
        return list2;
    }
    
}
