

public class bubblesorting {
    public static void main(String [] args){
        int array[]={3,4,6,22,11,5};
        int n = array.length;
        bubblesort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        } 

    }
    public static void bubblesort(int array[], int n){
        if(n==0 || n==1){
            return;
        }
        for(int j=0; j<n-1; j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
        bubblesort(array, n-1);
    }
}
