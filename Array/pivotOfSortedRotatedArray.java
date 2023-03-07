package Array;

public class pivotOfSortedRotatedArray {
    public static void main(String[] args) {
        int [] array={7,8,9,1,2,3,4,5};
        int n = array.length;
        
        int low=0;
        int high=n-1;
        
        while(low<high){
            int mid=0;
            mid=(low+high)/2;
            if(array[mid]>array[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        
        int ans = binarySearch(array, low, array.length-1, 4);
        System.out.println(ans);
    }
    public static int binarySearch(int array[], int low, int high, int target){
        int left=low;
        int right=high;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}

/*
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/pivot_of_sorted_and_rotated_array/topic
 */