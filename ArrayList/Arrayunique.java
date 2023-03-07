package ArrayList;
public class Arrayunique {
    public static void main(String [] args)throws Exception{  
        int array[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };                   
        int[] distinctArray = new int[20];                
        int index = 0;  
        for (int i = 0; i < array.length; i++) {   
            int flag = 0;   
            for (int j = 0; j < i; j++){  
                if (array[i] == array[j]){   
                    flag = 1;  
                    break;   
                }  
            }  
            if (flag == 0){   
                distinctArray[index] = array[i];  
                index++;    //increment index value  
            }  
        }    
        for(int i = 0; i < index; i++) {
            System.out.print( distinctArray[i] + " ");   
        }  
    }    
}



