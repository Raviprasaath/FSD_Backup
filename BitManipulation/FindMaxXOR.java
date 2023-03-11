package BitManipulation;

public class FindMaxXOR {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        int n=4;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
          int current_xor = 0;
          for (int j = i; j < n; j++) {
            current_xor = current_xor ^ array[j];
            ans = Math.max(ans, current_xor);
          }
        }
        System.out.print(ans);
      }
}
/*
 * Beside it is a hint saying “maximum XOR”. 
    You deduce that you have to find a subarray 
    (contiguous part of the array) according to the hint.
    Sample Input:
    
    4
    1 2 3 4

    Sample Output:
    
    7
 */