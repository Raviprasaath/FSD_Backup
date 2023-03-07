package Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class roughwork {

  public static void main(String[] args) throws IOException {

    try {

    //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //   String StrInput[] = br.readLine().trim().split(" ");
    //   int n = Integer.parseInt(StrInput[0]);
    //   int s = Integer.parseInt(StrInput[1]);
    //   int arr[] = new int[n];
    //   String StrInput2[] = br.readLine().trim().split(" ");

    //   for (int i = 0; i < n; i++) {
    //     arr[i] = Integer.parseInt(StrInput2[i]);
    //   }
    int n = 5;
    int s = 12;
    int arr[] = {1,2,3,7,5};

      int sum = arr[0];
      int startingindex = 0;
      int endingindex = 1;
      int j = 0;
      int i;

      for (i = 1; i <= n; i++)  {
        if (sum < s && arr[i] != 0) {
          sum += arr[i];
        }

        while (sum > s && startingindex < i - 1) {
          sum -= arr[startingindex];
          startingindex++;
        }

        if (sum == s) {
          endingindex = i + 1;
          if (arr[0] == 0) {
            System.out.print(startingindex + 2 + " " + endingindex);
          } else {
            System.out.print(startingindex + 1 + " " + endingindex);
          }
          break;
        }

        if (i == n && sum < s) {
          System.out.print(-1);
          break;
        }
      }

    } catch (Exception e) {
      System.out.print(-1);
    }
  }
}



  


