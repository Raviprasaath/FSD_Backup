package Array;

public class KadaneMethodArr {
    public static void main (String[] args) {
        int [] array = {-1, -2, -3};
        int n = array.length;
        int sum=0;
        // int prevSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum=array[i]+sum;
            max=Math.max(sum, max);   
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(max);
    }
}

/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Input: nums = [5,4,-1,7,8]

Output: 23

Date - 11-01-2023
*/
