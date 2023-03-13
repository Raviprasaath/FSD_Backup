package GeneralMath;

import java.math.BigInteger;

public class largerNumberMultiply {
    
    public static void main(String[] args) {
        String str1 = "498828660196";
        String str2 = "840477629533";
        
        System.out.println(multiply(str1, str2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger(num1); 
        bi2 = new BigInteger(num2); 
        bi3 = bi1.multiply(bi2);
        return ""+bi3;
      }
}
