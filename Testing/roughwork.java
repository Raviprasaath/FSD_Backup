package Testing;



public class roughwork {
  	public static void main(String[] args) {
		int [] array = {4,1,2};
        int n = array.length;
        
        int count = 0;
        int sumprev = 0;
        int sumpost = 0;
        int i =0, j=n-1;
        while (i < n && j != 0) {
            sumprev += array[i];
            if (sumprev < array[j]) {
                sumpost += array[j];
            }

            if (sumprev == sumpost) {
                count++;
                break;
            } 
            if (sumprev < sumpost) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        System.out.print(count!=0?sumprev:0);   
	}
    
}


    
  


