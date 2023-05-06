package Leetcode.Strings;

public class MaximumNumberofVowelsinaSubstringofGivenLength_1456 {
    public static void main(String[] args) {
        String str = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        System.out.println(maxVowels(str, 33));
    }
    public static int maxVowels(String s, int k) {
        int n = s.length(), max = 0;
        int count = 0;
        for (int i=0; i<k; i++) {
            char ch = s.charAt(i);
            if (vowels(ch)) {
                count++;
            }
            max = count;
        }

        for (int i=k; i<n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-k);
            int count2 = 0, count3 = 0;
            if (vowels(ch1)) {
                count2++;
            }
            if (vowels(ch2)) {
                count3++;
            }
            count += count2 - count3;
            max = Math.max(count, max);
        }        
        return max;
    }
    public static boolean vowels(char ch) {
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }

}
