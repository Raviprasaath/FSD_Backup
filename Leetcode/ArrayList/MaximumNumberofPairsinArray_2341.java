package Leetcode.ArrayList;
import java.util.ArrayList;
public class MaximumNumberofPairsinArray_2341 {
    public static void main(String[] args) {
        int [] array = {1,3,2,1,3,2,2};
        int [] ans = numberOfPairs(array);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] numberOfPairs(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        int count = 0;
        int index = 0;

        for (int i=0; i<nums.length; i++) {
            if (list.contains(nums[i])) {
                count++;
                index = list.indexOf(nums[i]);
                list.remove(index);
            } else {
                list.add(nums[i]);
            }
        }
        int arr[] = new int[2];
        arr[0] = count;
        arr[1] = list.size();
        return arr;
    }
}
