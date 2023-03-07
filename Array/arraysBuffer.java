package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysBuffer {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        
        String[] items = in.readLine().split(" ");
        int[] nums = new int[items.length];

        int maxEl = 0;
        for (int i = 0; i < nums.length; i++) {
            int el = Integer.parseInt(items[i]);
            nums[i] = el;

            maxEl = Math.max(maxEl, el);
        }

        // +1 because we are using indexes as factors
        // factors and divisors mean the same thing
        int[] factorsCounter = new int[maxEl + 1];

        for (int i = 0; i < nums.length; i++) {
            
            for (int factor = 1; factor <= Math.sqrt(nums[i]); factor++) {
                if (nums[i] % factor == 0) {
                    factorsCounter[factor]++;

                    int otherFactor = nums[i] / factor;
                    if (factor != otherFactor) {
                        factorsCounter[otherFactor]++;
                    }
                }
            }
        }
        
        for (int i = factorsCounter.length - 1; i >= 0; i--) {
            if (factorsCounter[i] > 1) {
                System.out.println(i);    
                break;
            }
        }
    }
}
