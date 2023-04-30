package Leetcode.Bitmanipulation;

public interface StrictlyPalindromicNumber_2396 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isStrictlyPalindromic(n));
    }
    public static boolean isStrictlyPalindromic(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {    
            sb.append(n%2);
            n = n/2;
            if (n==0) {
                sb.append(0);
            }
        }

        String str = sb.toString();
        
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '0') {
                return false;
            }
        }
        return true;
    }
}
