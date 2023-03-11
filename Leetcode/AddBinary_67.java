package Leetcode;

public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        int sum = 0;

        StringBuilder result =  new StringBuilder();
        
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if (i>=0) {
                sum = sum+A.charAt(i)-'0';
            }
            if(j>=0) {
                sum = sum+B.charAt(j)-'0';
            }
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
