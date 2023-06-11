package BinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (){}
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class LeafSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        System.out.println(leafSum(root));
    }
    public static int leafSum(TreeNode root){
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }
        return leafSum (root.left) + leafSum (root.right);
    }
}