import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CollationElementIterator;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;
import javax.sound.sampled.SourceDataLine;
import javax.sql.RowSet;
import javax.swing.border.CompoundBorder;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistTest {
    public static void main(String [] arge){
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
            for(int i = 0; i < index; i++)  
                System.out.print( distinctArray[i] + " ");   
        // int array[]={1,2,5,4,7,8,9,5,1,6};
        
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0; i<array.length-1; i++){
        //     if(!list.contains(array[i])){
        //         list.add(array[i]);
        //     }
        // }
        // for(Integer i:list){
        //     int count=0;
        //     for(int j=0; j<array.length-1; j++){
        //         if(i.equals(array[j])){
        //             count++;
        //         }
        //     }
        //     if(count>1)
        //     System.out.println(i+" "+count);
        // }
    }
}