import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(arr);
        System.out.println(root.val);
        tree.preorder(root);

    }


}

class BinaryTree
{
    static int idx=-1;

    public static Node buildTree(int arr[])
    {
        idx++;

        if(arr[idx]==-1)
        {
            return null;
        }
        Node n=new Node(arr[idx]);
        n.left=buildTree(arr);
        n.right=buildTree(arr);
        return n;
    }

    public static void preorder(Node root)
    {
        BigNode node=new BigNode();
        node.node=root;
        node.visit=1;

        Stack< Integer> st=new Stack();

        

    }


}
class Node
{
    int val;
    Node left,right;

    Node(int val)
    {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

class BigNode
{
    Node node;
    int visit;

    BigNode(Node node,int visit )
    {
        this.node=node;
        this.visit=visit;
    }
}