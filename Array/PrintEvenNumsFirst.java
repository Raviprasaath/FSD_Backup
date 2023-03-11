package Array;

public class PrintEvenNumsFirst {
    public static void main (String[] args) {
        
        int array[]={3, 1, 6, 8, 5};
        int n = array.length;

        int count=0;
        int array2[]=new int[n];
        for(int i=0; i<n; i++){
            if(array[i]%2==0){
                array2[count]=array[i];
                count++;
            }
        }
        int count2=0;
        for(int i=0; i<n; i++){
            if(array[i]%2!=0){
                array2[count2+count]=array[i];
                count2++;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(array2[i]+" ");
        }
    }
}
