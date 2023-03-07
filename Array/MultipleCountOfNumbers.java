package Array;

public class MultipleCountOfNumbers {
    public static void main(String[] args) {
        int [] Array = {6, 4, 3, 4, 1};
        int n = Array.length;

        int [] arr = countOfNumbers(Array, n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int [] countOfNumbers(int A[],int n){    
        int [] array = new int[n];
        
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=i+1; j<n; j++) {
                if ((A[i] <= A[j]) && (A[j] % A[i] == 0) ) {
                    count++;
                    array[i]=count;
                }
            }
        }
        return array;
    }
}