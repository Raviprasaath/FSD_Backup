

public class InsertionSorting {
    public static void main(String[] args) {
        int array[]={3,4,6,22,11,5};
        int n = array.length;
        insertionsorting(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        } 
    }
    public static void insertionsorting(int array[], int n){
        if(n==0||n==1){
            return;
        }
        for(int i=0; i<n; i++){
            for(int j=i; j>=1; j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                } 
            }
        }
        insertionsorting(array, n-1);
    }
}
