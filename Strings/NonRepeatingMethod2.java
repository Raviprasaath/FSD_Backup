package Strings;

public class NonRepeatingMethod2 {
    public static void main(String[] args) {
        String str = "aabccdde";
        nonRepeat(str);
    }
    public static void nonRepeat(String s) {
        int [] freq = new int[26];
        char [] ch = s.toCharArray();

        for (char ch1 : ch) {
            freq[ch1-'a']++;
        }
        for (char ch1 : ch) {
            if (freq[ch1-'a']==1) {
                System.out.println(ch1);
                
            }
        }
    }
}
