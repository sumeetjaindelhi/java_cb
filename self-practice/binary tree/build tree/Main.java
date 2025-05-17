import java.util.*;

public class Main 
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree
    {
        static int index=-1;
        public static Node buildTree(int [] arr)
        {
            index++;
            if(arr[index]==-1)
            {
                return null;
            }
            
            Node newNode=new Node(arr[index]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr);
            return newNode;
        }
    }
    public static void main (String args[])
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(root.data+" "+root.left+" "+ root.right);
    }
}