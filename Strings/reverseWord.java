package Strings;
import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        String str = "newton school";
           
        reverseSwap(str);
        // reverseNormal(str);
        // reverseStack(str);
    }
    public static void reverseSwap(String str) {
        int n = str.length();
        int start = 0;
        int end = n-1;
        char [] ch = str.toCharArray();

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        for (int i=0; i<n; i++) {
            System.out.print(ch[i]+" ");
        }
    }

    public static void reverseNormal(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        
        for (int i = n-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }

    public static void reverseStack(String str) {
        int n = str.length();
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