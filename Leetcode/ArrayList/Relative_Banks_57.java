package Leetcode.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Relative_Banks_57 {
    public static void main(String[] args) {
        int [] num = {10,3,8,9,4};
        String [] str = findRelativeRanks(num);
        for (int i=0; i<num.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
    public static String[] findRelativeRanks(int[] nums) {
        final int n = nums.length;
        String [] ans = new String[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(list);

    Collections.sort(list, (a, b) -> nums[b] - nums[a]);
        System.out.println(list);
    for (int i = 0; i < n; ++i)
      if (i == 0)
        ans[list.get(0)] = "Gold Medal";
      else if (i == 1)
        ans[list.get(1)] = "Silver Medal";
      else if (i == 2)
        ans[list.get(2)] = "Bronze Medal";
      else
        ans[list.get(i)] = String.valueOf(i + 1);

    return ans;
    }
}
