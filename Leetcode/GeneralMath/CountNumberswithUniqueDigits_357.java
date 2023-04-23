package Leetcode.GeneralMath;

public class CountNumberswithUniqueDigits_357 {
    public static void main(String[] args) {
        int n = 3;
    
        System.out.println(countNumbersWithUniqueDigits(n));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
        return 1;
    
        int ans = 10;
        int uniqueDigits = 9;
    
        for (int availableNum = 9; n > 1 && availableNum > 0; --n, --availableNum) {
        uniqueDigits *= availableNum;
        ans += uniqueDigits;
        }
    
        return ans;
    }
}
