package Strings;
import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        String str = "newton school";
        int n = str.length();
        // StringBuilder sb = new StringBuilder();
        
        // for (int i = n-1; i >= 0; i--) {
        //     sb.append(str.charAt(i));
        // }
        // System.out.println(sb);
        Stack <Character> st = new Stack<>();
        for (int i=0; i<n; i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        for (int i=0; i<n; i++) {
            System.out.print(st.pop()+"");
        }

    }
}
