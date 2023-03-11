package Array;

import java.util.ArrayList;

public class ZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};//indes=5 [0 0 1 1 1 2]
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                list.add(arr[i]);
            } else if (arr[i] == 1) {
                list.add(index, arr[i]);
                index++;
            } else if (arr[i] == 0) {
                list.add(0, arr[i]);
                index++;
            }
        }
        System.out.print(list);
    }
}
