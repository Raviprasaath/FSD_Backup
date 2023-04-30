package Leetcode.Arrays;

public class MedianofTwoSortedArrays_4 {
    public static void main(String[] args) {
                
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
        int n = arr1.length;
        int m = arr2.length;
        int c[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                c[k] = arr1[i];
                i++;
            } else {
                c[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            c[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = arr2[j];
            j++;
            k++;
        }

        if ((n + m) % 2 != 0)//
        {
            return c[(m + n) / 2];
        } else {
            int x = (m + n) / 2;//4
            double p = c[x];//c[2]
            double q = c[x - 1];//c[1]
            return (p + q) / 2;
        }
    }
}
