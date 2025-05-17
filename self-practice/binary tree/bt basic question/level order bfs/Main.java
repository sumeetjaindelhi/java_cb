import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,-1,6};
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(arr);
        // t.printLevelorder(root,3);
        t.printLevelorder1(root);
        
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

    public static void printLevelorder(Node root, int level)
    {
        
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.val+" ");
            return;
        }
        else if(level>1)
        {
            printLevelorder(root.left,level-1);
            printLevelorder(root.right, level-1);
        }
    }

    public static void printLevelorder1(Node root)
    {
        LinkedList<Node> ll=new LinkedList();
        ll.add(root);
        while(ll.size()>0)
        {
            Node temp=ll.removeFirst();
            System.out.print(temp.val+"  ");
            if(temp.left!=null)
            {
                ll.add(temp.left);
            }
            
            if(temp.right!=null)
            {
                ll.add(temp.right);
            }
        }
    }
}