package Leetcode.Basic;

public class DetermineColorChessSq_1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("h3"));
    }
    public static boolean squareIsWhite(String coordinates) {
        boolean flag = false;
        if (coordinates.charAt(0) %2 != 0 && coordinates.charAt(1) %2 == 0) {
            flag = true;
        } else if (coordinates.charAt(0) %2 == 0 && coordinates.charAt(1) %2 != 0) {
            flag = true;
        }
        return flag;    
    }
}
