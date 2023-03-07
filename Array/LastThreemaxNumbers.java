package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LastThreemaxNumbers {
    public static void main (String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for (int i=1; i<=T; i++){
            int N = Integer.parseInt(reader.readLine());
            int [] arr = new int[N];
            String numberString = reader.readLine();
            String[] numberArrayString = numberString.split(" ");

            for(int j=0; j<N; j++){
                arr[j]=Integer.parseInt(numberArrayString[j]);
            }
            Arrays.sort(arr);
            System.out.println(arr[N-1]+" "+arr[N-2]+" "+arr[N-3]);          
        }         
    }
}

/*
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4
 */