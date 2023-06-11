package BinaryTree;


class BinaryTree2 {
    int val;
    BinaryTree2 left;
    BinaryTree2 right;

    BinaryTree2(int data) {
        val = data;
        left = null;
        right = null;
    }

}
public class InorderTraversal {
    public static void main(String[] args) {
        BinaryTree2 root = new BinaryTree2(50);
        root.left = new BinaryTree2(25);
        root.right = new BinaryTree2(75);
        root.left.left = new BinaryTree2(12);
        root.left.right = new BinaryTree2(37);
        root.left.right.left = new BinaryTree2(30);
        root.right.left = new BinaryTree2(62);
        root.right.right = new BinaryTree2(87);
        root.right.left.right = new BinaryTree2(70);
        traversal(root);
    }
    public static void traversal(BinaryTree2 root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        System.out.print(root.val+" ");
        traversal(root.right);
    }

}