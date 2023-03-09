package Leetcode;

public class RemoveElement_27{
    public static void main(String[] args) {
        int [] array = {0,1,2,2,3,0,4,2};  // 3,2,2,3, val =3
        int val = 2;
        System.out.println(removeElement(array, val));
    }
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }   
        return j;
    }
}
