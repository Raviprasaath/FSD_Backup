package Array;
import java.util.Collections;
import java.util.ArrayList;

public class EvenOddSeperateSorting {
    public static void main (String[] args) {
        int [] array = {1,2,3,5,4,7,10};
        int n = array.length;
             
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            if (array[i] %2 != 0) {
                list1.add(array[i]);
            }
        }
        list1.sort((a,b) -> b-a);
        for (int i=0; i<n; i++) {
            if (array[i] %2 == 0) {
                list2.add(array[i]);
            }
        }
        Collections.sort(list2);

        for (int i=0; i<list1.size(); i++) {
            list3.add(list1.get(i));
        }
        int j=0;
        for (int i=list1.size(); i<list1.size()+list2.size(); i++) {
            
            list3.add(list2.get(j));
            j++;
        }

        for (int i=0; i<n; i++) {
            System.out.print(list3.get(i)+" ");
        }
    }
}
