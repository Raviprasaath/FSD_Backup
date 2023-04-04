package Testing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class roughwork {
  public static void main(String[] args) {
    String[] arr = {"aba", "aabb", "abcd", "bac", "aabc"};
//    String [] arr = {"aabb","ab","ba"};
    System.out.println(similarPairs(arr));
  }

  public static int similarPairs(String[] words) {
    int j = 0;
    ArrayList<Character> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int n = words.length;
    while (n-- != 0) {
      int i = 0;
      String temp = words[j];
      int k = temp.length();
      String str = "";
      while (k-- != 0) {
        if (!list.contains(temp.charAt(i))) {
          list.add(temp.charAt(i));
          sb.append(temp.charAt(i));
        }
        i++;
        str = sb.toString();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
      }
      list2.add(str);
      list.clear();
      sb.delete(0, sb.length());
      j++;
    }
    Collections.sort(list2);
    System.out.println(list2);
    int left = 0;
    int right = 1;
    int count = 0;


    for (int i = 0; i < words.length - 1; i++) {
      if (list2.get(left)  == list2.get(right)) {
        boolean ans = list2.get(left).toString().equals(list2.get(right));
        if (ans) {
          count++;
        }
      }
      left++;
      right++;
    }

    return count;
  }


}
    
  


