package Testing;



public class roughwork2 {
    public static void main(String[] args) {
        
        int n = 3;
        int [] array = {3,5,3};
        int total = 0;
        for (int i=0; i<n; i++) {
            total += array[i];
        }

        int ans = 0;
        int count = 0;
        int sumPrev = array[0];
        int sumMid = 0;
        int sumPost = array[n-1];
        int i = 1, j = n-2;
        while (i <n && j>0) {
            sumMid = total - (sumPost + sumPrev);
            if (sumPrev == sumPost && sumMid < sumPrev ) {
                ans = sumPrev;
                count++;
                break;
            } else if (sumPrev <= sumPost) {
                sumPrev += array[i];
                i++;
            } else {
                sumPost += array[j];
                j--;
            }
        }
        if (n<3) {
            count = 0;
        }
        System.out.print(count != 0?ans:0);  
    }
}
