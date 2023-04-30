package Leetcode.ArrayList;
import java.util.List;
import java.util.ArrayList;


public class KidsWiththeGreatestNumberofCandies_1431 {
    public static void main(String[] args) {
        int [] candies ={2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int index = 0;
        for (int i=0; i<candies.length; i++) {
            if (candies[i] > max) {
                index = i;
                max = candies[i];
            }
        }

        ArrayList <Boolean> ans = new ArrayList<>();
        
        for (int i=0; i<candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
