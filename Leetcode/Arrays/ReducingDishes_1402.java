package Leetcode.Arrays;
import java.util.Arrays;
import java.util.ArrayList;

public class ReducingDishes_1402 {
    public static void main(String[] args) {
        int [] array = {-1, -8, 0, 5, -9};
        System.out.println(maxSatisfaction(array));
    }
    //  beats 99 %
    public static int maxSatisfaction(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int sum = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            ans += sum;
        }
        return ans;
    }



    // TC 26 %

    public static int maxSatisfaction1(int[] arr) {
        Arrays.sort(arr);
        
        ArrayList <Integer> list = new ArrayList<>();        
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int max = 0;
        
        while (!list.isEmpty()) {
            int j = 1;
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += j*list.get(i);
                j++;
            }
            max = Math.max(max, sum);
            list.remove(0);
        }
        return (max); 
    }
}
