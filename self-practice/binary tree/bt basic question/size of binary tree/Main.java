import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(arr);
        System.out.println(t.maxofTree(root));
    }
}

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    static int idx = 0;

    public static Node buildTree(int arr[]) {
        if (arr[idx] == -1) {
            return null;
        }

        Node temp = new Node(arr[idx]);
        idx++;
        temp.left = buildTree(arr);
        temp.right = buildTree(arr);

        return temp;
    }

    public static int sizeofTree(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + (sizeofTree(root.left) + sizeofTree(root.right));
    }

    public static int maxofTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = maxofTree(root.left);
        int rightMax = maxofTree(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }
}