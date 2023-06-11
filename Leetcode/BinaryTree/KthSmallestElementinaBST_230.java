package Leetcode.BinaryTree;
import java.util.Stack;

class BinaryTree1 {
    int val;
    BinaryTree1 left;
    BinaryTree1 right;

    BinaryTree1 () {}
    
    BinaryTree1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class KthSmallestElementinaBST_230 {
    public static void main(String[] args) {
        BinaryTree1 root = new BinaryTree1(5);
        root.left = new BinaryTree1(3);
        root.left.left = new BinaryTree1(2);
        root.left.left.left = new BinaryTree1(1);
        root.left.right = new BinaryTree1(4);
        root.right = new BinaryTree1(6);
        System.out.println(kthSmallest(root, 3));
    }

    public static int kthSmallest(BinaryTree1 root, int k) {
        Stack <BinaryTree1> st = new Stack<>();
        BinaryTree1 current = root;
        int count =0;
        while (current != null || !st.isEmpty()) {
            while(current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            count++;
            if (count == k) {
                return current.val;
            }
            current = current.right;
        }
        return -1;
    }
}



