package Leetcode.Bitmanipulation;

public class CountingBits_338 {
    public static void main(String[] args) {
        int n = 5;
        int [] ans = countBits(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }
    }

    public static int[] countBits(int n) {
        int [] ans = new int[n+1];
        for (int i=1; i<=n; i++) {
            ans [i] = ans[i/2] + (i % 2 == 0 ? 0 : 1);
        }
        return ans;
    }


    // bit count 13%
    public static int[] countBits1(int n) {

        int [] ans = new int[n+1];
        for (int i=0; i<=n; i++) {
            int count = 0;
            String bits = Integer.toBinaryString(i);
            for (int j=0; j<bits.length(); j++ ) {
                if (bits.charAt(j) == '1') {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
