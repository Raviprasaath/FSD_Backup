package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class roughwork {
  	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
        
	}
    public static int pivotInteger(int n) {
        int left = 0;
        int right = n;
        int lsum = 0;
        int rsum = n;
        int ans = 0;
        while (lsum <= rsum) {
            if (lsum == rsum) {
                return lsum;
            } else if (lsum < rsum) {
                lsum += left;
                left++;
            } else {
                right--;
                rsum += right;
            }
        }
        return -1;
    }
    
}


    
  


