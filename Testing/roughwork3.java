package Testing;


public class roughwork3 {
    public static void main(String[] args) {
//        String a = "abcd";
//        String b = "cdabcdab";
        String a = "a";
        String b = "aa";

        System.out.println(longestCommonPrefix(a,b));
    }
    public static int longestCommonPrefix(String a, String b) {
        String temp = a;
        String prefix = b;
        int count = 1;

        while (temp.indexOf(prefix) < 0) {
            int val = temp.indexOf(prefix);
            temp = temp+""+a;
            count++;
        }
        System.out.println(temp);
        return count;

    }  
}
