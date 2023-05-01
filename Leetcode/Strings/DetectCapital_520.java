package Leetcode.Strings;

public class DetectCapital_520 {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        boolean flag = false;
        int ucount = 0, scount = 0, fcount = 0;
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            fcount++;
        }
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <='Z') {
                flag = true;
            } else {
                flag = false;
            }                        
            if (flag) {
                ucount++;
            } else if (!flag) {
                scount++;
            }
        }
        if (ucount==word.length() || scount==word.length() || 
        (ucount==1 && scount==word.length()-1 && fcount==1)) {
            return true;
        } else if (ucount==1 && scount==word.length()-1 && fcount==0) {
            return false;
        }
        return false;
    }
}
