public class QuickSortingEasy {
    public static void main(String[] args) {
        int array[]={98, 84, 65, 25, 122, 46};
        int n = array.length;
        quicksort(array,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void quicksort(int array[], int low, int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=array[mid];
        
        while(start<=end){
            while(array[start]<pivot){
                start++;
            }
            while(array[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(array, low, end);
        quicksort(array, start, high);
    }
}

/*
https://www.youtube.com/watch?v=vPymme0CjwE
 */