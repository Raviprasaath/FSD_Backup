package Leetcode;

public class FindFirstPalindromicStringInArray_2108 {
    public static void main(String[] args) {
        String [] str ={"abc","car","ada","racecar","cool"};
        String ans = firstPalindrome(str);
        System.out.println(ans);
    }
    public static String firstPalindrome(String[] words) {
        String ans ="";
        for (int i=0; i<words.length; i++) {
            if (palindrome(words[i])) {
                ans = words[i];
                break;
            } 
        }
        return ans;
    }
    public static boolean palindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if (ch1 == ch2) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
