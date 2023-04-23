package Leetcode.Strings;

public class Base7_504 {
    public static void main(String[] args) {
        int num = 100;
        System.out.print(convertToBase7(num));

    }
    public static String convertToBase7(int num) {
        int digit = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        boolean neg = false;
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            neg = true;
            num = num*-1;
        }
        while (num != 0) {
            digit = num % 7;
            sb.append(digit);
            num = num/7;
        }
        if (neg) {
            sb1.append('-');
            for (int i=sb.length()-1; i>=0; i--) {
                sb1.append(sb.charAt(i));
            }
        } else {
            for (int i=sb.length()-1; i>=0; i--) {
                sb1.append(sb.charAt(i));
            }
        }
        return sb1.toString();
    }
}
