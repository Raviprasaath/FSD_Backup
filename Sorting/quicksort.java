
public class quicksort {
    public static void main(String[] args) {
        int array[]={3,4,6,22,11,5};
        int n = array.length;

        quicksorting(array, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void quicksorting(int array[], int low, int high){
        //base case
        if(low>high){
            return;
        }
        // faith and work
        int partition=partition(array, low, high);
        quicksorting(array, low, partition-1);
        quicksorting(array, partition+1, high);
    }
    
    public static int partition(int array[], int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low; j<=high-1; j++){
            if(array[j]<pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;
    }

}
