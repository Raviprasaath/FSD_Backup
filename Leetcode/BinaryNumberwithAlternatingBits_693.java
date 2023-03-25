package Leetcode;

public class BinaryNumberwithAlternatingBits_693 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }
    public static boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        boolean flag = true;
        for (int i=0; i<str.length()-1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch1 == ch2) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }

        if (!flag) {
            return false;
        } else {
            return true;
        }
    }
}
