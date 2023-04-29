package Leetcode.Basic;
import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits_2160 {
    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }
    public static int minimumSum(int num) {
        
        int[] arr=new int[4];
        int itr=0;
        while(num!=0){
            arr[itr]=num%10;
            num=num/10;
            itr++;
        }
        Arrays.sort(arr);
  
        return ((arr[0]*10)+arr[3])+((arr[1]*10)+arr[2]);
    }
}
