package Leetcode;

public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {
        int [] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int count = 0;
        int left = 0;
        int right = 1;
        while (right < n){
            if (prices[left] < prices[right]) {
                count = prices[right] - prices[left];
                max = Math.max(count, max);
                right++;
            } else {
                left=right;
                right++;
            }
        }
        return max;
    }
}
