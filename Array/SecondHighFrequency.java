package Array;


public class SecondHighFrequency {
    public static void main(String[] args) {
        // int array[] = {1,2,2,3,3,3,4,4};
        int array[] = {14,15,16,16,16,12,12,12,25,16,17,16,12,12};

        int n= array.length;
        int count=0;
        int max=0;
        int index=0;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = i; j < n; j++) {
                if(array[i]==array[j]){
                    count++;
                }
                if(max<count){
                    index=array[j];
                }
                max=Math.max(max, count);
            }
        }
        System.out.println("max: "+max+" "+"index: "+index);
        // int count2=0;
        // int smax=0;
        // int index2=0;
        // for (int i = 0; i < n; i++) {
        //     if(array[i]!=max){
        //         count2=0;
        //     for (int j = i; j < n; j++) {
        //         if(array[i]==array[j]){
        //             count2++;
        //         }
        //         if(count>max){
        //             index2=array[j];
        //         }
        //         smax=Math.max(smax, count2);                
        //         }
        //     }
        // } 
        // System.out.println(smax+" "+index2);
        
    }
}
