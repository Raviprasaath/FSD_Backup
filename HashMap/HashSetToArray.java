package HashMap;
import java.util.HashSet;
public class HashSetToArray {
    public static void main(String[] args) {

//---------String to Array
        String [] array = {"1","1","3","4","5","5","6"};

        HashSet<String> hset = new HashSet<String>();        
        for (int i=0; i<array.length; i++) {
            hset.add(array[i]);
        }
        System.out.println(hset);
        
        String [] str = new String[hset.size()];
        hset.toArray(str);

        for(String i : str) {
            System.out.print(i+" ");
        }
        System.out.println();

//-------Int to Array
        int [] array2 = {1,1,3,4,5,5,6};

        HashSet<Integer> hset2 = new HashSet<Integer>();        
        for (int i=0; i<array2.length; i++) {
            hset2.add(array2[i]);
        }
        System.out.println(hset);

        hset2.toArray();

        for(int i : array2) {
            System.out.print(i+" ");
        }


        
    }
}
