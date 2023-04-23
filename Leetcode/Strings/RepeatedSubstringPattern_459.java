package Leetcode.Strings;

public class RepeatedSubstringPattern_459 {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        String idx = s+s;
        return idx.substring(1, idx.length()-1).contains(s);
    }

    // public static boolean repeatedSubstringPattern(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     StringBuilder delChar = new StringBuilder();
    //     delChar.append(s);
        
    //     sb.append(s.charAt(0));
    //     for (int i=1; i<s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if (delChar.toString().contains(sb)) {
    //             sb.append(ch);
    //             delChar.delete(0, i+1);
    //         } else {
    //             break;
    //         }
    //     }
    //     StringBuilder sb3 = new StringBuilder();
    //     sb3.append(s);
    //     for (int i=0; i<s.length()-delChar.length(); i++) {
    //         sb3.delete(0, delChar.length());
    //     }
    //     if (sb3.length()==0) {
    //         return true;
    //     }
    //     return false;

    // }
    
}
