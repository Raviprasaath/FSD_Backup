package HashMap;
import java.util.HashMap;

public class findOnlyUniqueElements2Arrays {
    public static void main(String[] args) {
      int [] array1 = {1, 45, 5 ,7, 9 , 5};
      int [] array2 = {2, 1, 5, 6, 1, 9};
      int n = array1.length;
      int m = array2.length;
      int index[] = new int[n+m];
      for(int i=0; i<n; i++) {
        index[i]=array1[i];
      }
      int j=0;
      for(int i=n; i<n+m; i++) {
        index[i]=array2[j];
        j++;
      }
      for (int i=0; i<n+m; i++) {
        System.out.print(index[i]+" ");
      }
      System.out.println();

      HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
      for (int i=0; i<n+m; i++){
        if (hmap.containsKey(index[i])) {
          hmap.put(index[i], hmap.get(index[i])+1);
        } else {
          hmap.put(index[i], 1);
        }
      }
      System.out.println(hmap);
  
      for( HashMap.Entry<Integer, Integer> entry : hmap.entrySet() ){
        if (entry.getValue()==1) {
          System.out.println( entry.getKey() );
        }
      }
    }
}


/*

[ 1, 45, 5 ,7, 9 , 5]

[ 2,1,5,6,1,9 ]

1 45 5 7 9 5 2 1 5 6 1 9 
1 1 1 2 5 5 5 6 7 9 9 45

Find only unique elements from these 2 arary .

Output: [2, 6, 7, 45]

 */