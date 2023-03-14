package Leetcode;
import java.util.HashMap;
public class NextGreaterElementI_496 {
    public static void main(String[] args) {
        int arr1 [] = {4,1,2};
        int arr2 [] = {1,3,4,2};
        
        int [] arr3 = nextGreaterElement(arr1, arr2);
        
        for (int i=0; i<arr3.length; i++) {
          System.out.print(arr3[i]+" ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
       
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                arr[i]=map.get(nums1[i]);
            }
        }

        for(int i=0;i<nums1.length;i++){
             boolean value=false;
            for(int j=arr[i];j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    nums1[i]=nums2[j];
                    value=true;
                    break;
                }
            }
            if(!value){
                nums1[i]=-1;
            }
        }
        return nums1;   
    }
}
