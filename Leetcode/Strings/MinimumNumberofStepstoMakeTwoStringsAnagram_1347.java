package Leetcode.Strings;

public class MinimumNumberofStepstoMakeTwoStringsAnagram_1347 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        System.out.println(minSteps(s, t));

    }
    public static int minSteps(String s, String t) {
        int [] ch = new int[26];
        for (int i=0; i<t.length(); i++) {
            ch[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length(); i++) {
            ch[t.charAt(i)-'a']--;                        
        }

        int sum = 0;
        for (int num : ch) {
            if (num != 0) {
                sum += Math.abs(num);
            }
        }

        return sum/2;
    }
}
