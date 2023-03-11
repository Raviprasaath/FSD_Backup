package HashMap.Practise;
import java.util.HashMap;

public class hashMapOP1 {
    public static void main(String[] args) {
        int [] array = {2,6,5,7};
        String [] arr = {"cycle","car","bike","bike2"};
        int n = array.length;
        HashMap <Integer, String> hmap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            hmap.put(array[i], arr[i]);    
        }
        // System.out.println(hmap);
        // for(HashMap.Entry<Integer, String> entry : hmap.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // hmap.entrySet().forEach(entry-> {
        //     System.out.println(entry.getKey()+" = "+entry.getValue());
        // });

        // for(Integer keys : hmap.keySet()) {
        //     System.out.println(keys);
        // } 

        // for (String value : hmap.values()) {
        //     System.out.println(value);
        // }
    }
    
}
