package Testing;


import java.util.ArrayList;

public class roughwork4 {
  public static void main (String[] args) {
    String n = "00000010100101000001111010011100";
    
  }
  public static int reverseBits(int n) {
    String str = Integer.toBinaryString(n);
    StringBuilder sb = new StringBuilder();
    for (int i=str.length()-1; i>=0; i--) {
        sb.append(str.charAt(i));
    }
    
    // long ans = Long.parseLong(sb.toString());
    // return (int)ans;
    return 1;
}
  
}

