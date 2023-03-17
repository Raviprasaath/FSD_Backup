package Testing;


public class roughwork {
  	public static void main(String[] args) {
		int [] array = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
		int k = 2;
		System.out.println(maxOperations(array, k));
	}
	public static int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (nums[i] <= k) {
                    sum = nums[i]+nums[j];
                    if (sum == k) {
                        nums[i] = Integer.MIN_VALUE;
                        nums[j] = Integer.MIN_VALUE;
                        count++;
                    }
                }

            }
        }
        return count;
    }
}

  


