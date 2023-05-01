package Leetcode.Basic;
import java.util.Arrays;



public class BoatstoSavePeople_881 {
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(numRescueBoats(arr, 3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        int ans = 0;

        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;

        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                ans ++;
                left++;
                right--; 
            } else {
                right--;
                ans++;
            }
            
        }
        return ans;
    }
}