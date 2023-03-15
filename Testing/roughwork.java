package Testing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class roughwork {

  public static void main(String[] args) {
    int arr[] = {1,2,2,4,5,6};
    int n = arr.length;
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i=0;i<n;i++){
		    hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
		    if(entry.getValue()>=2){
		        list.add(entry.getKey());
		    }
		}
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++){
		    set.add(arr[i]);
		}
		ArrayList<Integer> list2 = new ArrayList<>(set);
		Collections.sort(list2);
		int missing =0;
		for(int i=arr[0];i<arr[n-1];i++){
		    if(arr[i-1]!=i){
		        missing =i;
		    }
		}
		System.out.println("Duplicate num : "+list);
		System.out.println("Missing num : "+missing);
	}
  }
/*
 LETS SAY yuo have been given an array of integers

1,2,2,4,5,6

you need to find th number that is repeating and the number that is missing to complete the chainn

3,4,5,3,6,8

your missing number is :-

your repeatingnumber is :-
 */

  


