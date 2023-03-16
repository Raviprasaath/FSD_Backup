package Array;

public class MoveZeros {
    public static void main (String[] args) {
        int [] array = {0,0,0,0,1,2,3,4};
        int n = array.length;
        int k = 0;
        for (int i=0; i<n; i++) {
            if (array[i] != 0) {
                int temp = array[k];
                array[k] = array[i];
                array[i]=temp;
                k++;
            }             
        } 

        for (int i=0; i<n; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
