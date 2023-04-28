package Array;

public class WaveArray {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6};
        waveSort(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
    public static void waveSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
