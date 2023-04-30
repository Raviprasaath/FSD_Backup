package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target=sc.nextInt();
        int array[]=new int [n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(binary(array, target));
    }    
    public static int binary(int array[], int target) {
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                left=mid+1;
            }else if(array[mid]>target){
                right=mid-1;
            }
        }
        return 1;
    }
}
