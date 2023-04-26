package Leetcode.Basic;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 58;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));
    
        while (slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        return slow == 1;
    }
    
    public static int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    // trail and error method not exactly correct
    public static boolean isHappy1(int n) {
        int sum = 0;
        int sq = 0;
        int count = 0;
        while(count < 7) {
            sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sq = digit*digit;
                sum += sq;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
            count++;
        }
        return false;
    }
}
