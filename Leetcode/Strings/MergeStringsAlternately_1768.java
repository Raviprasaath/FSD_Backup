package Leetcode.Strings;


public class MergeStringsAlternately_1768 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pq";
        System.out.println(mergeAlternately(str1, str2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        StringBuilder sb = new StringBuilder();
        int len = (n < m ? n:m);
        int maxLen = (n > m ? n:m);
        
        int i=0, j=0;

        while (len != 0) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            len--;
            i++;
            j++;
        }
        if (m < n) {
            while (i < maxLen) {
                sb.append(word1.charAt(i));
                i++;
            } 
        } else {
            while (i < maxLen) {
                sb.append(word2.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}