import java.util.*;


public class HeightOfTree {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftTreeHeight = Height(root.left);
        int rightTreeHeight = Height(root.right);

        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(24);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(87);
        root.left.right = new TreeNode(98);
        root.right.right = new TreeNode(80);

        int treeHeight = Height(root);
        System.out.println("The height of the binary tree is: " + treeHeight);
    }
}
