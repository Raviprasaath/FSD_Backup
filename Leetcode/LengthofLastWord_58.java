package Leetcode;

public class LengthofLastWord_58 {
    public static void main(String[] args) {
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int count=0;
        int n=s.length()-1;
        int index=0;
        for(int i=n; i>0; i--){
            if(s.charAt(i)!=' '){
                index=i;
                break;
            }
        }
    
        for(int i=index; i>=0; i--){  
          if(s.charAt(i)!=' '){
            count++;
          }else{
            break;
          }
        }
        
        return count;
      }
}
