package Leetcode.Strings;
import java.util.Arrays;
public class FindSmallestLetterGreaterThanTarget_744 {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for(int i=0; i<letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
