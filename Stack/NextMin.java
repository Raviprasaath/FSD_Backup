package Stack;

import java.util.Stack;

public class NextMin {
    public static void main (String[] args) {
  
      int array[] = {8, 5, 3, 1, 2, 3};
      int n = array.length;
  
      Stack <Integer> st = new Stack<>();
      Stack <Integer> st2 = new Stack<>();
      st.push(array[0]);
      st2.push(array[0]);
  
  
      for(int i=1; i<n; i++) {
        if (array[i] < st2.peek()) {
          st2.push(array[i]);
        } else {
          st2.push(st2.peek());
        }
        st.push(array[i]);
      }
      while (!st.empty() && !st2.empty()) {
        System.out.println(st.pop() +":"+st2.pop());
      } 
    }
  }