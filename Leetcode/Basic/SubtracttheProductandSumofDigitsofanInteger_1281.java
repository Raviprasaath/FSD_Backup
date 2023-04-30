package Leetcode.Basic;

public class SubtracttheProductandSumofDigitsofanInteger_1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;
        
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            multi = multi * digit;
            n = n / 10;
        }
        return multi - sum;
    }
}
