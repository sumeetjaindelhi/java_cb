package lec_40_trees;

public class TreeFunctions {
	
	TreeNode root;
	int idx;
	
	TreeFunctions(int arr[],int idx)
	{
		this.idx=idx;
		root=buildTree(arr);
	}
	
	TreeNode buildTree(int arr[])
	{
		idx++;
		
		if(arr[idx]==-1 || idx==arr.length)
		{
			return null;
		}
		
		TreeNode node=new TreeNode(arr[idx]);
		node.left=buildTree(arr);
		node.right=buildTree(arr);
		return node;
	}
	
	void preOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
		return;
	}

	void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.val+" ");
		inOrder(root.right);
		return;
	}
	
	void postOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+" ");
		return;
	}
	
	
}
