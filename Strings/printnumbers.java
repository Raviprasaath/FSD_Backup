package Strings;



public class printnumbers {
    public static void main (String[] args) {
      String str = "s%3s4d5f6$7g8^d44g6(AHJth&1%j5y6j^%$";
      int n = str.length();
  
      for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if (isNum(ch)){
          System.out.print(ch+" ");
        } 
      }
    }
    public static boolean isNum(char ch){
      switch(ch){
        case '0':
        case '1': 
        case '2': 
        case '3':
        case '4': 
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        return true;  
      }
      return false;
    }
  }