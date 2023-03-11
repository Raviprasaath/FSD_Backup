package Array;


public class Find0s1s2s {
    public static void main(String[] args) {
        int array[]={0,0,2,2,1,1,0,1,2,0,0};
        int zerocount=0; 
        int onecount=0; 
        int twocount=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                zerocount++;
            }
            if(array[i]==1){
                onecount++;
            }
            if(array[i]==2){
                twocount++;
            }

        } 
        int [] array2=new int[array.length];
        for (int i = 0; i < zerocount; i++) {
            array2[i]=0;
        }
        for (int i = zerocount; i < onecount+zerocount; i++) {
            array2[i]=1;
        }
        for (int i = +zerocount+ onecount; i < twocount+onecount+zerocount; i++) {
            array2[i]=2;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }

    }
}
