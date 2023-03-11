package Array;
public class ZeroAndOne {
    public static void main(String[] args) {
        int [] array={0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0};

        segrate(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void segrate(int [] array){
        int zeroBoundary=0;
        int oneBoundary=array.length-1;

        while(zeroBoundary < oneBoundary){

            while(zeroBoundary < array.length && array[zeroBoundary]==0){
                zeroBoundary++;
            }

            while(oneBoundary >= 0 && array[oneBoundary]==1){
                oneBoundary--;
            }

            if(zeroBoundary < oneBoundary){
                array[zeroBoundary] = 0;
                array[oneBoundary] = 1;
                zeroBoundary++;
                oneBoundary--;
            }
        }
    }
}
