package Leetcode.Basic;

public class SmallestEvenMultiple_2413 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
        return (n%2==0?n:n*2);
    }
}
