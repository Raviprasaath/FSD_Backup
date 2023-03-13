package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII_503 {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};
        
        int [] arr2 = nextGreaterElements(arr);
        
        for (int i=0; i<arr.length; i++) {
          System.out.print(arr2[i]+" ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
      int[] ret = new int[nums.length];
      Arrays.fill(ret, -1);
      
      Stack<Integer> st = new Stack<>();
      for (int x = 0; x < 2 * nums.length; x++) { // O(n) + O(n) = O(n)
          while(!st.isEmpty() && nums[st.peek()] < nums[x % nums.length]) {
              ret[st.pop()] = nums[x % nums.length];
          }
          
          if (x < nums.length) {
              st.push(x);
          }
      }
      return ret;
    }
}
