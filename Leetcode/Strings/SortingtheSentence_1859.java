package Leetcode.Strings;

public class SortingtheSentence_1859 {
    public static void main(String[] args) {
        String str = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(str));
    }
    public static String sortSentence(String s) {
        String [] str = s.split(" ");
        String [] str2 = new String[str.length];

        for (int i=1; i<=str.length; i++) {
            int len = str[i-1].length();
            int ch = Character.getNumericValue(str[i-1].charAt(len-1));
            str2[ch-1] = str[i-1].substring(0, len-1);
        }
        String ans = String.join(" ",str2);
        return ans;
    }
}
