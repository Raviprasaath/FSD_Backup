package GeneralMath;

public class SquareRoot_easy {
    public static void main(String[] args) {
        int n = 30;
        double ans = sqrt(n);
        System.out.printf("%.2f", ans);
    }
    public static double sqrt(int num){
        double t=0;
        double sqrt=num/2;//9/2
        while(t-sqrt!=0){ // -4.5;
            t=sqrt;  // 4.5
            sqrt=(t+(num/t))/2; // 4.5+2
        }
       // int ans =(int)sqrt;
        return sqrt;
    }
}
