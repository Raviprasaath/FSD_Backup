package Testing;

import java.util.HashMap;
import java.util.ArrayList;

public class roughwork2 {
    public static void main(String[] args) {
        System.out.println(reverse(456));
    }
    public static int reverse (int nums) {
        int digit = 0;
        int remain = 0;
        while (nums != 0) {
            digit = nums%10;
            remain = (remain*10)+digit;
            nums = nums/10;
        }
        return remain;
    }
}
