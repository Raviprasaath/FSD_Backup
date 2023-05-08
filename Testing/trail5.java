package Testing;

import java.util.ArrayList;

public class trail5 {
    public static void main(String[] args) {
        String [] words = {"Hello","Alaska","Dad","Peace"};
        String [] ans = findWords(words);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static String[] findWords(String[] words) {
            ArrayList <String> row1 = new ArrayList<>();
            row1.add("qwertyuiop");
            ArrayList <String> row2 = new ArrayList<>();
            row1.add("asdfghjkl");
            ArrayList <String> row3 = new ArrayList<>();
            row1.add("zxcvbnm");

            int n = words.length;
            ArrayList <String> list = new ArrayList<>();
            int j = 0;
            while (n -- != 0) {

                int count1 = 0, count2 = 0, count3 = 0;
                for (int i=0; i<words[j].length(); i++) {
                    String str = words[j];
                    char ch = str.charAt(i);
                    if (row1.contains(ch)) {
                        count1++;
                      } else if (row2.contains(ch)) {
                        count2++;
                    } else if (row3.contains(ch)) {
                        count3++;
                    }
                }
                if (count1 == words[j].length()) {
                    list.add(words[j]);
                } else if (count2 == words[j].length()) {
                    list.add (words[j]);
                } else if (count3 == words[j].length()) {
                    list.add (words[j]);
                }
                j++;
            }
            String [] ans = new String[list.size()]; 
            for (int i=0; i<list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
    }

}
