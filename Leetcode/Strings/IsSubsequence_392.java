package Leetcode.Strings;

public class IsSubsequence_392 {
   
    public static void main(String[] args) {
       String str1 = "abc"; 
       String str2 = "ahbgdc";
       System.out.print(isSubsequence(str1, str2)); 
    }
    public static boolean isSubsequence(String s, String t) {        
        int n = s.length();
        int m = t.length();
        int k = 0;
        int i = 0;
        int iter = 0;
        while (i < m && iter < n) {
            if (t.charAt(i) == s.charAt(iter)) {
                iter++;
                k++;        
            } 
            i++;
        }
        if (k==n) {
            return true;
        } 
        return false; 
    }
}
