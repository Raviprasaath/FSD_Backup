package Testing;

public class roughwork {

  public static void main(String[] args) {
    long n = 4294967293l;

    System.out.println(hammingWeight(n));
  }
  public static int hammingWeight(long n) {

    int count = 0;

    while (n > 0) {
      int mask = ~n+1;
      int ans = mask & n;
      count++;
      n = n^ans;
    }

    return count;
  }
}



  


