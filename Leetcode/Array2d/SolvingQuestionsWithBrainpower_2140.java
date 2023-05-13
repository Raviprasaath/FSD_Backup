package Leetcode.Array2d;

public class SolvingQuestionsWithBrainpower_2140 {
    public static void main(String[] args) {
        int [][] arr = {{3,2},{4,3},{4,4},{2,5}};

        System.out.println(mostPoints(arr));
    }
    public static long mostPoints(int[][] questions) {
        int n=questions.length;
        long[] arr=new long[n];      
        arr[n-1]=questions[n-1][0];
        
        for(int i=n-2;i>=0;i--){
           arr[i]=arr[i+1];

          long curmax=questions[i][0];
          int index=i+questions[i][1]+1;

            if(index<n){
                curmax +=arr[index];
            } 

            arr[i]=Math.max(arr[i],curmax);          
        }
        return arr[0];       
    }


    // effiecent beats
    public static long mostPoints1(int[][] questions) {

        int n = questions.length;
        long[] dp = new long[n + 1];
    
        for (int i = n - 1; i >= 0; --i) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            int nextIndex = i + brainpower + 1;
            long nextPoints = nextIndex < n ? dp[nextIndex] : 0;
            dp[i] = Math.max(points + nextPoints, dp[i + 1]);
        }    
        return dp[0];    
    }

}
