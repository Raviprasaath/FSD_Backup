package Leetcode.Strings;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "bbbbababbbaabbba";
        String needle = "abb";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr1(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i=0; i<n-m+1; i++) {
            if (haystack.substring(i, i+m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }


    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
