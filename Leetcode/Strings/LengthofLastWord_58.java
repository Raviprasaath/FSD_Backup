package Leetcode.Strings;

public class LengthofLastWord_58 {
    public static void main(String[] args) {
        String s= "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
      int count = 0;
      for (int i=s.length()-1; i>=0; i--) {
          char ch = s.charAt(i);
          if (ch != ' ') {
              count++;
          } else {
              if (count>0) {
                  break;
              }
          }
      }
      return count;
      }
}
