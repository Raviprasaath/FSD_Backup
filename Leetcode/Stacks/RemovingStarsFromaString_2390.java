package Leetcode.Stacks;
import java.util.Stack;

public class RemovingStarsFromaString_2390 {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }

    
    // 79% beats
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeStars1(String s) {
        Stack <Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch =='*') {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}
