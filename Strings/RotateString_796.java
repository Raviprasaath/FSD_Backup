package Strings;

public class RotateString_796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abcde";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        String ss = s + s;
        return ss.contains(goal) && s.length()==goal.length();
    }
}
