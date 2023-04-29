package GeneralMath;

public class SquareRoot_easy {
    public static void main(String[] args) {
        int n = 8;
        double ans = sqrt(n);
        System.out.printf("%.2f", ans);
    }
    public static double sqrt(int num){
        double t=0;
        double sqrt=num/2;
        while(t-sqrt!=0){ 
            t=sqrt;  
            sqrt=(t+(num/t))/2; 
        }
       // int ans =(int)sqrt;
        return sqrt;
    }
}
