package Strings;

import java.util.ArrayList;

public class nonRepeatingChar {
    public static void main (String[] args) {
      String str = "newtone";
      int n  = str.length();
      char array [] = new char[n];
      for (int i=0; i<n; i++) {
        array[i]=str.charAt(i);
      }
      
      ArrayList <Character> list = new ArrayList<>();
      ArrayList <Character> list2 = new ArrayList<>();
      for (int i=0; i<n; i++) {
  
        if (list.contains(str.charAt(i)) ) {
          list2.add(str.charAt(i)); 
        } else {
          list.add(str.charAt(i)); 
        }
      }
  
      for (int i=0; i<n; i++) {
        if (!list2.contains(array[i]) ){
          System.out.println(array[i]);
          break;
        }
      }
    }
  }