package Leetcode;
import java.util.HashMap;

public class LongestPalindrome_409 {
    public static void main(String[] args) {
        String str ="ccc";
        System.out.println(longestPalindrome(str));
    }
    public static int longestPalindrome(String s) {
        int [] ch = new int[128];
        for (char c : s.toCharArray()) {
            ch[c]++;
        } 
        int count = 0;
        for (Integer char_count : ch) {
            count += char_count / 2 * 2;
            if (count % 2 == 0 && char_count % 2 == 1) {
                count++;
            } 
        }
        return count;
    }

    public static int longestPalindromeOld(String s) {
        
    // Takes so long time and Beats is 23%    

        HashMap <Character, Integer> hmap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
        }
        int count = 0;
        for (Integer i : hmap.values()) {
            if (i >= 2) {
                if (i % 2 == 0) {
                    count += i;
                } else {
                    int temp = i;
                    while (temp != 0 && temp != 1) {
                        temp = temp - 2;
                        count = count + 2;
                    }
                }
            }
        }
        for (Integer i : hmap.values()) {
            if (i %2 != 0) {
                count++;
                break;
            }
        }
        return count;
    }
}
