package Leetcode.Strings;

public class MaximumNumberofWordsFoundinSentences_2114 {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i=0; i<sentences.length; i++) {           
            String [] str = sentences[i].split(" ");
            max = Math.max(max, str.length);
        }
        return max;
    }
}
