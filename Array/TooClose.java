package Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TooClose {
    public static void main(String[] args) {
        int [] array = {4,7,10,6,5};
        int k = 6;
        System.out.print(close(array, k));
    }
    public static int close(int[]array, int k) {
        ArrayList <Integer> list = new ArrayList<>();
        Arrays.sort(array);
        int n = array.length;
        
        int ans = 0;
        for (int i=0; i<n; i++) {
            list.add(array[i]);
        }

        int listMin = array[0];
        int listMax = array[n-1];
        // System.out.println(listMax);
        // System.out.println(listMin);
        
        int j = 1;
        for (int i=0; i<n; i++) {
            int temp1 = k+j; //increase
            int temp2 = k-j; //decrease
            if (!list.contains(k)) {
                ans = k;
                break;
            } else if (!list.contains(temp2) && (listMin <= k)) {
                ans = temp2;
                // System.out.println(ans);
                break;
            } else if (!list.contains(temp1) && (listMax >= k)) {
                ans = temp1;
                // System.out.println("plus"+ans);
                break;
            } else {
                j++;
            }
        }
        return ans;
    }
}
