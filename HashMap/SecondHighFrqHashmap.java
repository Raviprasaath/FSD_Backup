package HashMap;

import java.util.HashMap;

public class SecondHighFrqHashmap {
    public static void main(String args[]) {
        int[] array = {3,1,3,4,2};

        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        // for (int i : array) {
        //     if (frequencyMap.containsKey(i)) {
        //         frequencyMap.put(i, frequencyMap.get(i) + 1);
        //     } else {
        //         frequencyMap.put(i, 1); // {5:3, 4:2, 3:1, 2:1, 1:1}
        //     }
        // }
        for (int i=0; i<array.length; i++) {
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0)+1);
        } 
        System.out.println("testing "+frequencyMap);

        int first = 0, second = 0;
        // [3,2,1,1,1]
        for (int i : frequencyMap.values()) {
            if (i > first) { //3>0
                second = first;
                first = i; 
            } else if (i > second && i != first) { 
                second = i;
            }
        }
        
        // System.out.println("Second highest frequency: " + second);
        System.out.println("Second highest frequency: " + first);
        // System.out.println(frequencyMap.get(second));
        }
}

