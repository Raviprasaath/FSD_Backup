package Leetcode;

public class PalindromeNumber_9{
    public static void main(String[] args) {
        int x = -121;

        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int temp = x;
        if(temp < 0 || (temp % 10 == 0 && temp != 0)){
            return false;
        }
        int digit = 0;
        int remain = 0;
        while (x != 0) {
            digit = x % 10;
            remain = digit+(remain*10);
            x=x/10;
        }
        return (temp==remain?true:false);
    }
}