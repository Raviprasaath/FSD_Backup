package Testing;
import java.util.Arrays;
import java.util.Stack;

public class roughwork3 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countDigitOne(n));
    }
    public static int countDigitOne(int n) {
        String num =Integer.toBinaryString(n);
        int ans = 0;
        System.out.println(num);
        for (int i=0; i<num.length(); i++) {
            if (num.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }
    

}