package Leetcode.Strings;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            
            char start = s.charAt(i);
            char end = s.charAt(j);
            
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            
            i++;
            j--;    
        }
    
    return true;
    }
}