package Testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class roughwork2 {
    public static void main(String[] args) {  
        int [] array = {3,4,5,3,6,8};
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
        
        // for (HashMap.Entry <Integer, Integer> entry : hmap.entrySet()) {

        // }
        Arrays.sort(array);
        HashSet <Integer> hset = new HashSet<>();
        for (int i=0; i<n; i++) {
            hset.add(array[i]);
        }
        System.out.println(hset);
        int min = array[0];
        int max = array[n-1];
        
        int sum = (max)*(max+1)/2;
        System.out.println(sum); 
    }
     

}


/*
 LETS SAY yuo have been given an array of integers

test case 1 - 1,2,2,4,5,6
test case 2 - 3,4,5,3,6,8

you need to find th number that is repeating and the number that is missing to complete the chainn


your missing number is :-

your repeatingnumber is :-
 */