package Leetcode.Basic;

public class LeftandRightSumDifferences_2574 {
    public static void main(String[] args) {
        int [] array = {10,4,8,3};        
        int ans [] = leftRigthDifference(array);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] leftRigthDifference(int[] nums) {
        int val=0;
        for(int it: nums){
            val+=it;
        }
        int leftsum=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        //val-leftsum-nums[i] give u the right most value  and we just have to sub rightsum-leftsum
            ans[i]=Math.abs((val-leftsum-nums[i])-leftsum);
            leftsum+=nums[i];
        }
        return ans;
    }
    

    // 62% beats    
    public static int[] leftRigthDifference1(int[] nums) {
        
        int [] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];
        
        leftSum[0] = 0;
        rightSum[0] = 0;

        for (int i=1; i<nums.length; i++) {
            int sum = 0;
            leftSum[i] = nums[i-1] + leftSum[i-1];
        }

        int j = 0;
        for (int i=nums.length-1; i>=0; i--) {
            rightSum[j] = nums[i];
            j++;
        }

        int [] prefRightSum = new int[nums.length];
        prefRightSum[0] = 0;  
        for (int i=1; i<nums.length; i++) {
            prefRightSum[i] = rightSum[i-1] + prefRightSum[i-1];
        }
        int revArr[] = new int[nums.length];
        int k = 0;
        for (int i=nums.length-1; i>=0; i--) {
            revArr[k] = prefRightSum[i];
            k++;
        }
        int [] ans = new int [nums.length];
        for (int i=0; i<nums.length; i++) {
            ans[i] = Math.abs(leftSum[i]-revArr[i]);
        }
        return ans;
    }
}
