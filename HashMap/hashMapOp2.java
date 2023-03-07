package HashMap;
import java.util.HashMap;
public class hashMapOp2 {
    public static void main(String[] args) {
        int [] array = {2,6,5,7};
        String [] arr = {"cycle","car","bike","bike2"};
        int n = array.length;
        HashMap <Integer, String> hmap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            hmap.put(array[i], arr[i]);    
        }
       
        for(Integer keys : hmap.keySet()) {
            System.out.println(keys);
        } 
    }
}
