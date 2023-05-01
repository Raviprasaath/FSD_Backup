package Testing;
import java.util.Arrays;
import java.util.Stack;

public class roughwork3 {
    public static void main(String[] args) {
        String str = "10001";

        System.out.println(removeKdigits1(str, 4));
    }
    public static String removeKdigits1(String num, int k) {
        int kbackup = k;
        StringBuilder sb = new StringBuilder();
        String backup = ""+num;
        int min = Integer.MAX_VALUE;

        for (int i=backup.length(); i>=0+k; i--) {
            sb.delete(0, num.length());
            sb.append(num);
            sb.delete(i, i+k);
            String str = sb.toString();
            int nums = Integer.parseInt(str);
            min = Math.min(min, nums);
        }
        for (int i=0; i<backup.length()-kbackup; i++) {
            sb.delete(0, num.length());
            sb.append(num);
            sb.delete(i, i+k);
            String str = sb.toString();
            int nums = Integer.parseInt(str);
            min = Math.min(min, nums);
        }
        int ans = min;
        if (ans==Integer.MAX_VALUE) {
            return "0";
        } else {
            return min+"";
        }

    }

}