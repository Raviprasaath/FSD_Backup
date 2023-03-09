package Leetcode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i=0; i<32; i++) {
            int ans = mask & n;
            if (ans != 0) {
                count++;
            }
            n = n >> 1;         // n >>= 1;
        }
        return count;
    }
}
