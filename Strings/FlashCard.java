package Strings;

import java.util.Scanner;

class Flashcarddd{

    String word;
    String meaning;

    Flashcarddd(String w, String m){
        word=w;
        meaning=m;
    }

    public String toString(){
        return String.format("> %s ( %s ) ", word, meaning);
    }
}
public class FlashCard {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); //hi
        String meaning = sc.nextLine(); // hello
 
         System.out.println(new Flashcarddd(word, meaning));
     }
}
