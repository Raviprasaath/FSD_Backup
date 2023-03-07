package Array;


import java.util.ArrayList;
import java.util.Arrays;


public class missingAndDuplicate {
    public static void main(String[] args) {
        int array[]={1, 2, 3, 2, 5, 6};
        int N = 6;

        Arrays.sort(array);
        int index=0;
        for(int i=0; i<N-1; i++){
            if(array[i+1] == array[i]){
                index=array[i];
                break;
            }          
        }
        System.out.println(index);

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<N; i++){
            if(!list.contains(array[i])){
                list.add(array[i]);
            }
        }
        int index2=0;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i+1)-list.get(i) != 1){
                index2=list.get(i+1)-1;
            }
        }
        System.out.println(index2);
        /*
Arr : 1 2 3 2 5 6

N=6

Find missing and duplicate number

Output : 2 and 4
 */
    }
}
