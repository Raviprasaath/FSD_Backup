package Leetcode;

public class ReverseInteger_7 {
    
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int y) {
        long ans=0;
        long digit=0;
        long remain=0;
        long x =(long) Math.abs(y);

        while(x>0){
            digit=x%10;
            remain = digit+(remain*10);
            x=x/10;
        }

        if(y<0){
            remain=remain*-1;
        }
        
        if(remain>=-2147483648 && remain<=2147483647){ 
            ans=remain;
        }else{
            ans= 0;
        }
        return (int)ans;
        
    }
}
