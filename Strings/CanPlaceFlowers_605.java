package Strings;

public class CanPlaceFlowers_605 {
    public static void main(String[] args) {
        int [] flower ={1,0,0,0,1};
        System.out.println(canPlaceFlowers(flower, 1));
    }
    // little easy
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        if (n == 0)
          return true;
    
        for (int i = 0; i < flowerbed.length; ++i)
          if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
              (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1;
            if (--n == 0)
              return true;
          }
    
        return false;
    }

    // easy understanding
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
            int count=0;
            int index=0;
            int itr=1;

            for(int i=0;i<len;i++){
                if(flowerbed[i]==1){
                    index=i;
                    break;
                }
            }
            if(index%2==0){
                itr=0;
            }
            for(int i=itr;i<len;i+=2){
                
                if(flowerbed[i]!=1){
                    count++;                            
                }
                if(i!=len-1){
                    if(flowerbed[i+1]!=0){
                        count--;
                        i++;
                    }                
                }       
            }
            
            if(count>=n){
                return true;
            }
            return false;
        }
}
