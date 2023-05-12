package Leetcode.Strings;

import java.util.ArrayList;

public class KeyboardRow_500 {
    public static void main(String[] args) {
        String [] words = {"Hello","Alaska","Dad","Peace"};
        String [] ans = findWords(words);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        String ans = "";
        
        ArrayList <String> strList = new ArrayList<>();

        for (int i=0; i<words.length; i++) {
            String org = words[i];
            String ch = org.toLowerCase();

            if (str1.contains(""+ch.charAt(0))) {
                ans = str1;
            } 
            if (str2.contains(""+ch.charAt(0))) {
                ans = str2;
            } 
            if (str3.contains(""+ch.charAt(0))) {
                ans = str3;
            }
            int count = 0; 
            for (int j=0; j<words[i].length(); j++) {
                
                if (ans.contains(""+ch.charAt(j))) {
                    count++;
                }
            }
            if (count == ch.length()) {
                strList.add(org);
            }
        }
        String [] anss = new String[strList.size()];
        for (int i=0; i<strList.size(); i++) {
            anss[i] = strList.get(i);
        }
        return anss;
    }
}
