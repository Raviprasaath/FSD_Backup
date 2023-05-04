package Leetcode.Strings;

public class ShuffleString_1528 {
    public static void main(String[] args) {
        String s= "codeleet";
        int [] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, arr));
    }
    public static String restoreString(String s, int[] indices) {
                
        StringBuilder sb = new StringBuilder();
        char [] ch = s.toCharArray();

        for (int i=0; i<s.length(); i++) {
           ch[indices[i]] = s.charAt(i);

        }
        for (int i=0; i<s.length(); i++) {
            sb.append(ch[i]);
        }

        return sb.toString();
    }
}
