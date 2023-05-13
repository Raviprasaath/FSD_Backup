package Leetcode.Basic;

public class FinalValueofVariableAfterPerformingOperations_2011 {
    public static void main(String[] args) {
        String [] str = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(str));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (int i=0; i<operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                sum++;
            } else {
                sum--;
            } 
        }
        return sum;
    }
}
