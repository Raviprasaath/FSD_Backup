package Strings;


public class PrintAlphebtsInString {

    public static void main (String[] args) {
  
      String str = "s%3s4d5f6$7g8^d44g6(AHJth&1%j5y6j^%$";
      int n = str.length();
  
      for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
          System.out.print(ch+" ");
        } 
      }
    }
  }