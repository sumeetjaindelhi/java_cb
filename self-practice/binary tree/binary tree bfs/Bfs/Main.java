import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(arr);
        System.out.println(root.val);
        tree.levelorder(root);

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

    public static void levelorder(Node root)   //bfs
    {
        if(root==null)
        {
            return;
        }

        LinkedList<Node> ll=new LinkedList<>();
        ll.add(root);

        while(ll.size()>0)
        {
            Node removed=ll.removeFirst();
            System.out.print(removed.val+ "  ");
            if(removed.left!=null)
            {   
                ll.add(removed.left);
            } 
            if(removed.right!=null)
            {
                ll.add(removed.right);  
            }
        }
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