package Leetcode.Basic;

public class PeakIndexinaMountainArray_852 {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return 0;   
    }
}
