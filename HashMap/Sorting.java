package HashMap;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class Sorting {
    public static void main(String[] args) {
        HashMap <Character, Integer> hmap = new HashMap<>();
        hmap.put ('B', 2);
        hmap.put ('A', 4);
        hmap.put ('D',1);
        hmap.put ('F', 9);
        hmap.put ('C', 3);

// ------------Sort by Value---------------
        
        for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        ArrayList <HashMap.Entry <Character, Integer>> list = new ArrayList<>();
        for (HashMap.Entry <Character, Integer> entry: hmap.entrySet()) {
            list.add(entry);
        }
        
        Comparator <HashMap.Entry <Character, Integer>> comp = new Comparator <HashMap.Entry <Character, Integer>>() {
            public int compare(HashMap.Entry <Character, Integer> o1, HashMap.Entry <Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        
        Collections.sort(list, comp);
        HashMap <Character, Integer> sortMap = new LinkedHashMap<>();
        
        for (HashMap.Entry <Character, Integer> entry : list) {
            sortMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("sorted ans");
        for (HashMap.Entry <Character, Integer> entry : sortMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
// ------------Sort by Key---------------
        // for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        // ArrayList <HashMap.Entry <Character, Integer>> list = new ArrayList<>();
        // for (HashMap.Entry <Character, Integer> entry: hmap.entrySet()) {
        //     list.add(entry);
        // }

        // Comparator <HashMap.Entry <Character, Integer>> comp = new Comparator <HashMap.Entry <Character, Integer>>() {
        //     public int compare(HashMap.Entry <Character, Integer> o1, HashMap.Entry <Character, Integer> o2) {
        //         return o1.getKey().compareTo(o2.getKey());
        //     }
        // };

        // Collections.sort(list, comp);
        // HashMap <Character, Integer> sortMap = new LinkedHashMap<>();

        // for (HashMap.Entry <Character, Integer> entry : list) {
        //     sortMap.put(entry.getKey(), entry.getValue());
        // }

        // System.out.println("sorted ans");
        // for (HashMap.Entry <Character, Integer> entry : sortMap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

//---------------------Reverse by inbuild function-------------
        // for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        // ArrayList <HashMap.Entry <Character, Integer>> list = new ArrayList<>();
        // for (HashMap.Entry <Character, Integer> entry: hmap.entrySet()) {
        //     list.add(entry);
        // }

        // Comparator <HashMap.Entry <Character, Integer>> comp = new Comparator <HashMap.Entry <Character, Integer>>() {
        //     public int compare(HashMap.Entry <Character, Integer> o1, HashMap.Entry <Character, Integer> o2) {
        //         return o1.getKey().compareTo(o2.getKey());
        //     }
        // };

        // Collections.sort(list, comp.reversed());
        // HashMap <Character, Integer> sortMap = new LinkedHashMap<>();

        // for (HashMap.Entry <Character, Integer> entry : list) {
        //     sortMap.put(entry.getKey(), entry.getValue());
        // }

        // System.out.println("sorted ans");
        // for (HashMap.Entry <Character, Integer> entry : sortMap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

//-----------reverse by equation o1, o2 interchange----------
        // for (HashMap.Entry <Character, Integer> entry : hmap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        // ArrayList <HashMap.Entry <Character, Integer>> list = new ArrayList<>();
        // for (HashMap.Entry <Character, Integer> entry: hmap.entrySet()) {
        //     list.add(entry);
        // }

        // Comparator <HashMap.Entry <Character, Integer>> comp = new Comparator <HashMap.Entry <Character, Integer>>() {
        //     public int compare(HashMap.Entry <Character, Integer> o1, HashMap.Entry <Character, Integer> o2) {
        //         return o2.getKey().compareTo(o1.getKey());
        //     }
        // };

        // Collections.sort(list, comp);
        // HashMap <Character, Integer> sortMap = new LinkedHashMap<>();

        // for (HashMap.Entry <Character, Integer> entry : list) {
        //     sortMap.put(entry.getKey(), entry.getValue());
        // }

        // System.out.println("sorted ans");
        // for (HashMap.Entry <Character, Integer> entry : sortMap.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }
    }
}
