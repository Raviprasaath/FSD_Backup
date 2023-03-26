package Recursion;

import java.util.Stack;

public class ReverseStackByRecursion {
    public static void main(String[] args) {
		St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        System.out.println(St);
        Reverse_Stack();
        System.out.println("Reversed Stack");
        System.out.println(St);
        
	}
    static Stack <Integer> St = new Stack <Integer>();
    public static void Reverse_Stack(){
        if (St.size() > 0) {
            int x = St.peek();
            St.pop();
            Reverse_Stack();
            pushval(x);
        }    
    }
    public static void pushval(int temp) {
        if (St.isEmpty()) {
            St.push(temp);
        } else {
            int x = St.peek();
            St.pop();
            pushval(temp);
            St.push(x);
        }
    }
}
