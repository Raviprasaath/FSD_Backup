package Leetcode.Basic;

public class AddDigits_258 {
    public static void main(String[] args) {
        int n = 58;
        System.out.print(addDigits(n));
    }
    public static int addDigits(int num) {
        boolean flag = true;
        int sum = 0;
        while (flag) {
            sum = 0;
            while (num != 0 && flag) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum < 10) {
                flag = false;
            } else {
                num = sum;
                flag = true;
            }
        }     
        return sum;
    }
}
