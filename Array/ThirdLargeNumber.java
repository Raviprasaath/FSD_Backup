package Array;

public class ThirdLargeNumber {
    public static void main(String[] args) {  
        int array[] = {1,2,2,3,3,3,4,4};
        int max=0;
        int smax=0;
        int tmax=0;
        for(int i=0; i<array.length; i++){
            max=Math.max(array[i], max);
        }
        for(int i=0; i<array.length; i++){
            if(array[i]!=max){
                smax=Math.max(array[i], smax);
            }
        }
        for(int i=0; i<array.length; i++){
            if((array[i]!=max) && (array[i]!=smax)) {
                tmax=Math.max(array[i], tmax);
            }
        }
        System.out.print(tmax);
    }
}
