package Leetcode.Strings;

public class NumberofStringsThatAppearasSubstringsinWord_1967 {
    public static void main(String[] args) {
        String [] patters = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patters, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int counter = 0 ;
        for(int i = 0 ; i < patterns.length ; i++){
            if(word.contains(patterns[i])){
                counter++;
            }
        }
        return counter;
    }
}
