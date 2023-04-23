package Leetcode.Strings;

public class IntegerToRoma_12 {
    public static void main(String[] args) {
        int n = 1998;
        System.out.println(intToRoman(n));
    }
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int [] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i=0; i<arr.length; i++) {
            while (num >= arr[i]) {
                sb.append(str[i]);
                num = num-arr[i];
            }
        }
        return sb.toString();
    }
}
