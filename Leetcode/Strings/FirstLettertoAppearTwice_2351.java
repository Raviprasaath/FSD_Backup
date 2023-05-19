package Leetcode.Strings;

import java.util.HashSet;

public class FirstLettertoAppearTwice_2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashSet <Character> hset = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            if (hset.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            hset.add(s.charAt(i));
        }
        return '0';
    }
}
