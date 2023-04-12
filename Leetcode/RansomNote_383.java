package Leetcode;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine  = "aab";
        boolean ans = canConstruct(ransomNote, magazine);
        System.out.println(ans);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[128];

        for (char c : magazine.toCharArray()) {
            ++count[c];
        }

        for (char c : ransomNote.toCharArray()) {
            if (--count[c] < 0) {
                return false;
            }
        }
        return true;        
    }
}
