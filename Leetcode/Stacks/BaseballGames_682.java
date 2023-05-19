package Leetcode.Stacks;

import java.util.Stack;

public class BaseballGames_682 {
    public static void main(String[] args) {
        String [] str = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(str));
    }
    public static int calPoints(String[] operations) {
        
        Stack <Integer> st = new Stack <>();
        st.push(Integer.parseInt(operations[0]));
        for (int i=1; i<operations.length; i++) {
            String ch = operations[i];
            if (ch.equals("C") && st.size()>=1) {
                st.pop();
            } else if (ch.equals("+") && st.size()>=2) {
                int num1 = st.pop();
                int num2 = st.pop();
                int ans = num1 + num2;
                st.push(num1);
                st.push(num2);
                st.push(ans);
            } else if (ch.equals("D") && st.size()>=1) {
                int num = st.pop();
                int ans = num*2;
                st.push(num);
                st.push(ans);
            } else {
                int num = Integer.parseInt(ch);
                st.push(num);
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}
