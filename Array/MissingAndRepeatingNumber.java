package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {  
        int [] array = {1,2,2,4,5,6};
        int n = array.length;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<n; i++) {
            hmap.put (array[i], hmap.getOrDefault(array[i],0 )+1);
        }
        System.out.println(hmap);
        for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()){
            if (entry.getValue()==2) {
                System.out.print("your repeatingnumber is :- "+entry.getKey());
            } 
            
        }
        System.out.println();


        Arrays.sort(array);
        HashSet <Integer> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            set.add(array[i]);
        }
        int k = array[0];
        set.toArray();
        for (int i : set) {
            if (k != i) {
                System.out.print("your missing number is :-"+ k+" ");
                break;
            }
            k++;
        }
    }
}
