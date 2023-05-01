package Testing;
import java.util.Arrays;
import java.util.Stack;

public class roughwork3 {
    public static void main(String[] args) {
        int [] arr = {3,5,3,4};
        System.out.println(numRescueBoats(arr, 5));
    }
    public static int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        boolean flag = true;
        Arrays.sort(people);
        Stack <Integer> st = new Stack<>();
        for (int i=0; i<people.length; i++) {
            st.push(people[i]);
        }

        while (!st.isEmpty()) {
            int temp;
            int sum = 0;
            if (st.peek() == limit) {
                st.pop();
                ans++;
            }
            if (!st.isEmpty() && st.peek() < limit ) {
                temp =st.pop();
                if ((st.size()>=2 && (sum += temp) <= limit && (sum += st.peek()) <= limit)) {
                    flag = true;
                } else {
                    st.push(temp);
                    flag = false;
                }
                if (flag) {
                    sum += st.pop();
                    ans++;
                } else {
                    sum += st.pop();
                    ans++;
                }
            }
        }
        return ans;
    }
}