package Leetcode;
import java.util.List;
import java.util.Arrays;

public class FizzBuzz_412 {
    public static void main(String[] args) {
        int n = 15;
        
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        String[] result = new String[n];
          for(int i = 1; i < n+1; ++i){
              if (i % 15 == 0){
                  result[i-1] = "FizzBuzz";
              } else if (i % 5 == 0) {
                  result[i-1] = "Buzz";
              } else if (i % 3 == 0) {
                  result[i-1] = "Fizz";
              } else {
                  result[i-1] = Integer.toString(i);
              }
          }
          return Arrays.asList(result);
      }
}
