package Leetcode;

public class FirstUniqueCharacterinString_387 {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s) {
        int [] freq = new int[26];
        char []  ch = s.toCharArray();

        for (char c : ch) {
            freq [c-'a']++;
        }

        for (int i=0; i<ch.length; i++) {
            if (freq[ch[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
