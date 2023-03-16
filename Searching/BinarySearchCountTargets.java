package Searching;

public class BinarySearchCountTargets {
    public static void main(String[] args) {
		int [] array = {2,5,5,5,6,6,8,9,9,9};
		int target = 9;
	
		int count = 0;
		int left = 0;
		int right = array.length-1;
		while (left <= right) {
			int mid = left + (right-left)/2;
			if (array[mid] == target) {
				count++;
				array[mid]=0;
				
			} else if (array[mid]<=target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		System.out.print(count);
	}
}
