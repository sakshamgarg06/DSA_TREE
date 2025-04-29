import java.util.*;

public class NumberOfLeaf {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int numberofleaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null)
            return 1;
        return numberofleaves(root.left) + numberofleaves(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(1);
        root.right.right = new Node(2);

        System.out.println("Number of leaf nodes: " + numberofleaves(root));
    }
}
