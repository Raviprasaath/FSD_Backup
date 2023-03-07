package HashMap;

import java.util.HashMap;

public class hashMapOp4 {
    public static void main(String[] args) {
        int [] array = {2,6,5,7};
        String [] arr = {"cycle","car","bike","bike2"};
        int n = array.length;
        HashMap <Integer, String> hmap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            hmap.put(array[i], arr[i]);    
        }
        
        hmap.entrySet().forEach(entry-> {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        });
        
    }
}
