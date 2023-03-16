package Leetcode;
import java.util.HashMap;

public class RomantoInteger_13 {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String s) {
        HashMap <Character, Integer> hmap = new HashMap<>();
        hmap.put ('I', 1);
        hmap.put ('V', 5);
        hmap.put ('X', 10);
        hmap.put ('L', 50);
        hmap.put ('C', 100);
        hmap.put ('D', 500);
        hmap.put ('M', 1000);

        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            
            if (i > 0 && hmap.get(s.charAt(i)) > hmap.get(s.charAt(i-1)) ){
                sum += hmap.get(s.charAt(i))-(2*hmap.get(s.charAt(i-1))) ;
                
            } else {
                sum += hmap.get(s.charAt(i)); 
            }
        }
        return sum;
    }
}
