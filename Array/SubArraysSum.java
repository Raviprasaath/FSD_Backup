package Array;

public class SubArraysSum {
    public static void main (String[] args) {
        long [] array = {1,2,3,4};
        int n = array.length;
        
        long temp = 0;
        long ans = 0;
        for (int i=0; i<n; i++) {
            temp = 0;
            for (int j=i; j<n; j++) {
                temp += array[j];
                ans += temp; 
            }
        }
        System.out.print(ans);
    }
}
